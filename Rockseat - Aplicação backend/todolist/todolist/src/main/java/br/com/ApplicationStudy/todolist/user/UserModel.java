package br.com.ApplicationStudy.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

/**
 * @Getter: Irá apenas adicionar os getters
 * @Setter: Irá apenas adicionar os setters
 * @Data: Irá adcionar os getters e os setters
 * Biblioteca: Lombok
 */
@Data
@Entity(name="tb_users") // o objeto usuário será uma tabela do banco de dados
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    // id dos usuários gerados automáticamente
    private UUID id;

    //@Column(name = "nome de usuário")
    @Column(unique = true)
    private String username;

    //@Column(name = "nome")
    private String name;

    //@Column(name = "senha")
    private String password;

    @CreationTimestamp
    private LocalDateTime createAt;
    
}
