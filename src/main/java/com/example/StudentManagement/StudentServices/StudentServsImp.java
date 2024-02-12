package com.example.StudentManagement.StudentServices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentManagement.Entity.Student;
import com.example.StudentManagement.studentRepo.StudentRepository;

@Service
public class StudentServsImp implements StudentServs {
	
	@Autowired
	StudentRepository sr;

	@Override
	public String addStudent(Student s) {
		
		sr.save(s);
		return "student saved";
	}

	@Override
	public Student getStudent(String id) {
		// TODO Auto-generated method stub
	        Optional<Student> st=sr.findById(id);
	        return st.get();
	}

	@Override
	public String updateStudent(Student s) {
		sr.save(s);
		return "student updated";
	}

	@Override
	public String deleteStudent(String s) {
		
		sr.deleteById(s);
		return "deleted";
	}

}
