package com.onetomany.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Employees {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	
	@Column(length = 20, nullable = false)
	private String ename;
	
	@Column(length = 11, nullable = false, unique = true)
	private long ephone;
	
	@Column(length = 25, nullable = false, unique = true)
	private String email;
	
	@Column(length = 10, nullable = false)
	private double esalary;
	
	@Column(length = 30, nullable = false)
	private String address;
	

}
