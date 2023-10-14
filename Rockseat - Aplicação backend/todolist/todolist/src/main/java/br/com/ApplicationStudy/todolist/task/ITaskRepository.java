package br.com.ApplicationStudy.todolist.task;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ApplicationStudy.todolist.task.TaskModel;

public interface ITaskRepository extends JpaRepository<TaskModel, UUID>{
    
}
