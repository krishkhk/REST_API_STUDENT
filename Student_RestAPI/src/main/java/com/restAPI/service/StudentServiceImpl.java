package com.restAPI.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restAPI.model.Student;
import com.restAPI.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo repo;

	public List<Student> displayAscnd() {
		// TODO Auto-generated method stub

		List<Student> stlist = repo.findAll();

		List<Student> employeesSortedList1 = stlist.stream().sorted((o1, o2) -> (int) (o2.getSmarks() - o1.getSmarks()))
				.collect(Collectors.toList());

		return employeesSortedList1;
	}

	public List<Student> displayAgrade(String grade) {
		// TODO Auto-generated method stub
		List<Student> gradeList = repo.findBysgrade(grade);

		return gradeList;
		
	}

	
	
	public List<Student> allPassed(String results) {
		// TODO Auto-generated method stub
		System.out.println(results);
		
		List<Student> allpassedstdnts=repo.findBysresult(results);
		
		System.out.println(allpassedstdnts);
		
		
		return allpassedstdnts;
	}


	public List<Student> topHighStudents() {
		// TODO Auto-generated method stub
		List<Student> top=repo.findAll();
		
List<Student> toplist=top.stream().sorted(Comparator.comparingInt(Student::getSmarks).reversed()).limit(3).collect(Collectors.toList());

		return toplist;
	}

	

	public List<Student> students() {
		// TODO Auto-generated method stub
		List<Student> allStudents=repo.findAll();
		return allStudents;
	}

	
	public String saveStudents(Student student) {
		// TODO Auto-generated method stub
		String d;
		Student st=repo.save(student);
		if(st!=null) {
			d= "Data inserted!!!";
		}else {
			d= "Data not inserted !!!! ";
		}
		return d;
	}

	
	
	
	

	
}
