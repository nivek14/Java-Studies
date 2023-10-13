package br.com.ApplicationStudy.todolist.user;

import lombok.Data;

/**
 * @Getter: Irá apenas adicionar os getters
 * @Setter: Irá apenas adicionar os setters
 * @Data: Irá adcionar os getters e os setters
 * Biblioteca: Lombok
 */
@Data
public class UserModel {

    private String username;
    private String name;
    private String password;
    
}
