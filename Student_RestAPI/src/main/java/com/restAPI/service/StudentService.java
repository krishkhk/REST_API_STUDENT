package com.restAPI.service;

import java.util.List;

import com.restAPI.model.Student;

public interface StudentService {
	public List<Student> students();
	
	public String saveStudents(Student student);
	
	public List<Student> displayAscnd();
	
	public List<Student> displayAgrade(String grade);
	
	public List<Student> allPassed(String results);
	
	public List<Student> topHighStudents();
	
	
	
 	
	
	
	
	

}
