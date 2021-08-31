package com.example.studentmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity

@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	public Long getId() {
		return id;
	}

	@Column(name="name", nullable=false, unique = true) 
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z ]{1,20}",message="may be name is repeated And 1st Letter should be capital")
	@UniqueUsername(message="Name already exists")
	private String name;
	
	
	@Column(name="address")
	private String address;
	
	
	@Column(name="weight",nullable=false)
	private  Double weight;
	
	

	
	public Student() {
		
	}
	
	public Student(String name, String address, Double weight) {
		super();
		this.name = name;
		this.address = address;
		this.weight= weight;
	}
	
	

	
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

//	public Student getData() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
	
	

}

