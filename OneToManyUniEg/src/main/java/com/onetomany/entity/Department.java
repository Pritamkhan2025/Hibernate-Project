package com.onetomany.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Department {
	
	@Id
	private int did;
	
	@Column(length = 20, nullable = false)
	private String dname;
	
	@Column(length = 20, nullable = false)
	private String dcity;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "did")
	private List<Employees> employees;


}
