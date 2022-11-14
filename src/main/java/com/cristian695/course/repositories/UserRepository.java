package com.cristian695.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristian695.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
