package com.onetoone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity


public class Address {
	
	@Id
	private long idnumber;
	
	@Column(length = 20, nullable = false)
	private String idtype;
	
	@Column(length = 40, nullable = false)
	private String address;
	
	@Column(length = 20, nullable = false)
	private String city;
	
	@Column(length = 20, nullable = false)
	private String state;
	
	private long pincode;
	
	@OneToOne(targetEntity = Citizen.class)
	private Citizen citizen;
	
	
}
