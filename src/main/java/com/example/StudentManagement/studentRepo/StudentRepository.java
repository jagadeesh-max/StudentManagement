package com.example.StudentManagement.studentRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentManagement.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, String>{

}
