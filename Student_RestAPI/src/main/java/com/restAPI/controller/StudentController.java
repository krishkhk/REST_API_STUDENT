package com.restAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restAPI.model.Student;
import com.restAPI.service.StudentServiceImpl;

//http://localhost:8080/students    ----> Get All Students
//http://localhost:8080/addStudents -----> Add Students.
//http://localhost:8080/getMarks    ----> Descending
//http://localhost:8080/passedStudents/{results} --> Display Pass/Fail Students.
// http://localhost:8080/EnterGrade/{grade}  ---->Display A grade.
// http://localhost:8080/getHighestMarksStudents ---> Display Top 3 Highest Marks Students.
@RestController

public class StudentController {

	@Autowired
	private StudentServiceImpl stuImpl;

	// getAll Student Details
	@GetMapping("/students")
	public List<Student> getAllStudents() {

		List<Student> alldata = stuImpl.students();

		return alldata;

	}

	// create student data.


	@PostMapping("/addStudents")
	public  String addStudents(@RequestBody Student students){
		
		String s=stuImpl.saveStudents(students);
		
		return s;
		
	}

	// Display the names of students in Descending order of their marks.
	@GetMapping("/getMarks")
	public List<Student> getMarks() {

		List<Student> listMarks = stuImpl.displayAscnd();

		return listMarks;

	}

	// Display the list of students who secured a grade.

	@PostMapping("/EnterGrade/{grade}")

	public List<Student> getGrade(@PathVariable("grade") String grade) {

		List<Student> listGrades = stuImpl.displayAgrade(grade);

		return listGrades;
	}

	// Display the list of all passed students.

	@PostMapping("/passedStudents/{results}")
	public List<Student> passdData(@PathVariable("results") String results) {

		List<Student> listData = stuImpl.allPassed(results);

		return listData;

	}

	// Display the list of top 3 students according to their marks.

	@GetMapping("/getHighestMarksStudents")
	public List<Student> getTopMarks() {
		List<Student> toplistmarks = stuImpl.topHighStudents();

		return toplistmarks;
	}

}
