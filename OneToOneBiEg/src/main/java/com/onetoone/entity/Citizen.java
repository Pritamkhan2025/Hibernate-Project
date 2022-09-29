package com.onetoone.entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity

public class Citizen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	
	@Column(length = 20, nullable = false)
	private String cname;
	
	@Column(length = 20, nullable = false)
	private String surname;
	
	@Column(length = 11, nullable = false, unique = true)
	private long phone;
	
	@Column(length = 30, nullable = false, unique = true)
	private String email;
	
	@Column(length = 20, nullable = false)
	private String dob;
	
	
	@OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
	private Address address;//aggregation




}
