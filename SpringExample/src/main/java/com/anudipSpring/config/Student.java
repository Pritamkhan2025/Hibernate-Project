package com.anudipSpring.config;


public class Student {
	
	private int sid;

	private String sname;
	
	private String semail;
	
	private double sfees;
	
	private Course course;
	
	public Student(int sid, String sname, String semail, double sfees, Course course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
		this.sfees = sfees;
		this.course = course;
	}

	public void show() {
		System.out.println(sid+" "+sname+" "+semail+" "+sfees);
		System.out.println(course.toString());
	}	

}
