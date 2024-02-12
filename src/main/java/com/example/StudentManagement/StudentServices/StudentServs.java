package com.example.StudentManagement.StudentServices;

import com.example.StudentManagement.Entity.Student;

public interface StudentServs {
	
	String addStudent(Student s);
	Student getStudent(String id);
	String updateStudent(Student s);
	String deleteStudent(String s);

}
