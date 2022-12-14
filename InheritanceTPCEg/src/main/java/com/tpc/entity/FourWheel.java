package com.tpc.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//@DiscriminatorValue(value = "four")
@AttributeOverrides({
	@AttributeOverride(name="vid",column=@Column(name="vid")),
	@AttributeOverride(name="fuel",column=@Column(name="fuel")),
	@AttributeOverride(name="engine",column=@Column(name="engine")),
	@AttributeOverride(name="vtype",column=@Column(name="vtype")),
	@AttributeOverride(name="price",column=@Column(name="price")),
	@AttributeOverride(name="speed",column=@Column(name="speed")),
})

public class FourWheel extends Vehicle{
	
	private int modelno;
	
	private String modelname;
	
	private boolean musicsystem;
	
	private String etype;
	
	private boolean ac;

}
