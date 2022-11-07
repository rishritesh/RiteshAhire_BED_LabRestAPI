package com.lab.service;

import java.util.List;

import com.lab.entities.Student;



public interface StudentServive {
	
	public List<Student> findAll();

	public Student findById(int id);

	public void save(Student student);

	public void deleteById(int id);

	

}
