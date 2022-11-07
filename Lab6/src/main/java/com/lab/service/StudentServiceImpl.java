package com.lab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.dao.StudentRepository;
import com.lab.entities.Student;

@Service
public class StudentServiceImpl implements StudentServive {
	@Autowired
	StudentRepository studentRepository;


	public List<Student> findAll() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public void save(Student student) {
		studentRepository.save(student);
		
	}

	@Override
	public void deleteById(int id) {
		studentRepository.deleteById(id);
		
	}
	
	
	

}
