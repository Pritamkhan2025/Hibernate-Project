package com.anudip.col.entity;

import java.util.Iterator;
import java.util.List;

public class Course {
	
	private String cname;
	private int duration;
	private String trainer;
	private List<String> students;
	
	public Course(String cname, int duration, String trainer, List<String> students) {
		super();
		this.cname = cname;
		this.duration = duration;
		this.trainer = trainer;
		this.students = students;
	}
	
	public void show() {
		System.out.println(cname+" "+duration+" "+trainer);
		System.out.println("Student List");
		Iterator<String> itr=students.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
