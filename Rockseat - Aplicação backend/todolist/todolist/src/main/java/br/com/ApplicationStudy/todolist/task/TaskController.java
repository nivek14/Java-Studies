package br.com.ApplicationStudy.todolist.task;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ApplicationStudy.todolist.utils.Utils;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private ITaskRepository taskRepository;

    @PostMapping("/")
    public ResponseEntity create(@RequestBody TaskModel taskModel, HttpServletRequest request){

        Object idUser = request.getAttribute("idUser");
        taskModel.setIdUser((UUID) idUser);

        LocalDateTime currentDate = LocalDateTime.now();

        if(currentDate.isAfter(taskModel.getCreatedAt()) || currentDate.isAfter(taskModel.getEntAt())){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("wrong date format...");
        }

        if(taskModel.getStartAt().isAfter(taskModel.getEntAt())){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("wrong date format...");
        }

        TaskModel task = this.taskRepository.save(taskModel);

        return ResponseEntity.status(HttpStatus.OK).body(task);

    }

    @GetMapping("/")
    public List<TaskModel> List(HttpServletRequest request){
        Object idUser = request.getAttribute("idUser");
        List<TaskModel> tasks = this.taskRepository.findByIdUser((UUID) idUser);
        return tasks;
    }

    @PutMapping("/{id}")
    public TaskModel update(@RequestBody TaskModel taskModel, @PathVariable UUID id, HttpServletRequest request){
        Object idUser = request.getAttribute("idUser");
        Object task = this.taskRepository.findById(id).orElse(null);
        Utils.copyNonNullProperties(taskModel, task);
        return this.taskRepository.save(task);
    }
    
}
