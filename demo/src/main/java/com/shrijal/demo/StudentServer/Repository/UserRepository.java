package com.shrijal.demo.StudentServer.Repository;

import com.shrijal.demo.StudentServer.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String userName);
}