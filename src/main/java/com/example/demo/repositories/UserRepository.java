package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.course.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
