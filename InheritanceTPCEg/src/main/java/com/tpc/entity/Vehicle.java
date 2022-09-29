package com.tpc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Table(name="vehicle_info")
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name="type", discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue(value = "vehicle")

public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vid;
	
	@Column(length = 20)
	private String fuel;
	
	@Column(length = 20)
	private String engine;
	
	@Column(length = 4)
	private int speed ;
	
	@Column(length = 20)
	private String vtype;
	
	private double price; 

}
