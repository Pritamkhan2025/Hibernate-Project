package com.maven.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="emp_maven")
@Entity
//entity class
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	
	@Column(length = 20, nullable = false)
	private String ename;
	
	@Column(length = 12, nullable = false, unique = true)
	private long ephone;
	
	@Column(length = 25, nullable = false, unique = true)
	private String email;
	
	@Column(length = 10, nullable = false)
	private double esalary;
	
	@Column(length = 50)
	private String addr;
	
	
}
