package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class StudentMarks {
	
	@Id
	private int rollNo;
	private String name;
	private String college;
	private String course;
	private int fee;
	private int maths;
	private int eng;
	private int sci;
	public StudentMarks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentMarks(int rollNo, String name, String college, String course, int fee, int maths, int eng, int sci) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.college = college;
		this.course = course;
		this.fee = fee;
		this.maths = maths;
		this.eng = eng;
		this.sci = sci;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	

 	
	
	
	
	
}
