package com.model;
import jakarta.persistence.*;
@Entity
@Table (name="Studentdata")
public class Student {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int roll;
	String name,course;
	float marks;
	public Student (String name,String course,float marks) {
		super();
		this.name=name;
		this.course=course;
		this.marks=marks;		
	}
	public Student() {
    }
	public int getRoll() {
		return roll;
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
		
	}
