package br.com.ApplicationStudy.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserModel, UUID>{
    UserModel findByUsername(String username); // automaticamente esse método vai fazer um select procurando por um username no db
}
