package com.restAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="students")
public class Student {
	
	@Id
	
	
	private Integer sid;
	
	private String sname;
	
	 public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Integer smarks;
	 
	 private Integer sage;
	 
	 private String sgrade;
	 
	 private String sresult;

	public Student(Integer sid, String sname, Integer smarks, Integer sage, String sgrade, String sresult) {
		
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
		this.sage = sage;
		this.sgrade = sgrade;
		this.sresult = sresult;
		
		
		
		
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getSmarks() {
		return smarks;
	}

	public void setSmarks(Integer smarks) {
		this.smarks = smarks;
	}

	public Integer getSage() {
		return sage;
	}

	public void setSage(Integer sage) {
		this.sage = sage;
	}

	public String getSgrade() {
		return sgrade;
	}

	public void setSgrade(String sgrade) {
		this.sgrade = sgrade;
	}

	public String getSresult() {
		return sresult;
	}

	public void setSresult(String sresult) {
		this.sresult = sresult;
	}
	 


}
