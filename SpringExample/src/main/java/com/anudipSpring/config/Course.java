package com.anudipSpring.config;

public class Course {
	
	private String cname;
	private int cduration;
	private String ctrainer;
	
	public Course(String cname, int cduration, String ctrainer) {
		super();
		this.cname = cname;
		this.cduration = cduration;
		this.ctrainer = ctrainer;
	}
	
	public String toString() {
		return "Course [cname=" +cname +",cduration=" +cduration+" ,ctrainer="+ctrainer+"]";
		
	}

}
