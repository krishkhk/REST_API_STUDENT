package com.restAPI.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.restAPI.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	@Query(value ="select * from todo.students s where s.sgrade=?1",nativeQuery = true)
	public List<Student> findBysgrade(String sgrade);
	
	@Query(value="select * from todo.students s where s.sresult=?1",nativeQuery = true)
	public List<Student> findBysresult(String sresult);
	
	
	

}
