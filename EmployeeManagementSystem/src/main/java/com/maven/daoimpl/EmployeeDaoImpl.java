package com.maven.daoimpl;



import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.maven.config.HibernateUtil;
import com.maven.dao.EmployeeDao;
import com.maven.entity.Employee;

;

public class EmployeeDaoImpl implements EmployeeDao {
	
	Scanner sc=new Scanner(System.in);
	
	//create object from HibernateUtil
	Session session = HibernateUtil.getSessionFactory().openSession();
	//transaction implementation
	Transaction t1 = session.beginTransaction();

	@SuppressWarnings("deprecation")
	@Override
	public void addEmployee() {
		String n,a,e;
		long p;
		double s;
		
		System.out.println("Enter your name: ");
		n = sc.next();
		System.out.println("Enter your address: ");
		a = sc.next();
		System.out.println("Enter your email address: ");
		e = sc.next();
		System.out.println("Enter your mobile number: ");
		p = sc.nextLong();
		System.out.println("Enter your salary: ");
		s = sc.nextDouble();
		
		Employee emp1=new Employee();
		//set all values
		emp1.setEname(n);
		emp1.setAddr(a);
		emp1.setEmail(e);
		emp1.setEphone(p);
		emp1.setEsalary(s);
		
		session.save(emp1);
		System.out.println("Employee details save sucessfully");
		//commit 
		t1.commit();
		
	}

	@Override
	public void fetchEmployee() {
		
		int id;
		System.out.println("Enter id: ");
		id = sc.nextInt();
		Employee emp2 = session.get(Employee.class, id);	
		//print the book data
		System.out.println("Display Book details");
		System.out.println(emp2.getEid()+" "+emp2.getEname()+" "+emp2.getAddr()+" "+emp2.getEmail()+" "+emp2.getEphone()+" "+emp2.getEsalary());
		
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void updateEmployee() {
			
		//taking user input
		System.out.println("Enter id: ");
		int id = sc.nextInt();	
		//identify the book
		Employee emp3 = session.get(Employee.class, id);	
		
		//print the book data
		System.out.println("Enter new mobile number: ");
		long phone=sc.nextLong();
		emp3.setEphone(phone);
		
		//update the data
		session.update(emp3);	
		System.out.println("Update Successfully");	
		t1.commit();
		
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void deleteEmployee() {
		
		//taking user input
		System.out.println("Enter id: ");
		int id = sc.nextInt();	
		
		//identify the book
		Employee emp4 = session.get(Employee.class, id);
		session.delete(emp4);
		System.out.println("Delete Successfully");
		t1.commit();
		
	}
	
	
}
