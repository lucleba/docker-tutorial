package com.lucle.springboottutorial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucle.springboottutorial.models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
