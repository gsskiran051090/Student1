package com.example.demo.employee;


import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
public class Employee {
	@Id
	@SequenceGenerator(name = "employee_sequence",sequenceName = "employee_sequence",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_sequence")
	
	private Long id;
	private String name,email;
	private LocalDate dob;
	@Transient
	private Integer age;
	
	
	public Employee() {
		
	}

	public Employee(Long id, String name, String email, LocalDate dob) {
		
		this.id = id;
		this.name = name;
		this.email = email;
//		this.age = age;
		this.dob = dob;
	}

	public Employee(String name, String email, LocalDate dob) {
		
		this.name = name;
		this.email = email;
		/*
		 * this.age = age;
		 */		this.dob = dob;
	}

	public Long getId() {
		return id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	  public Integer getAge() { return Period.between(this.dob, LocalDate.now()).getYears(); }
	  
	  public void setAge(Integer age) { this.age = age; }
	 

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ",age="+age+", dob=" + dob + "]";
	}
	
	
	
	
	
	

}

