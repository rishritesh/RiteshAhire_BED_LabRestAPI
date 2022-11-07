package com.lab.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lab.entities.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	

}
