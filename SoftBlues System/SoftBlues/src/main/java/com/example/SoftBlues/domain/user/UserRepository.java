package com.example.SoftBlues.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

    public Iterable<User> findByName(String name);
    public Iterable<User> findByUsername(String userName);

}
