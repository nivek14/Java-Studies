package br.com.ApplicationStudy.todolist.task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity(name = "tb_tasks")
public class TaskModel {
    
    //dados gerais
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    private String description;

    @Column(length = 50)
    private String title;
    
    private LocalDateTime startAt;
    private LocalDateTime entAt;
    private String priority;

    // data de criação do dado
    @CreationTimestamp
    private LocalDateTime createdAt;

    // chave estrangeira
    private UUID idUser;

}
