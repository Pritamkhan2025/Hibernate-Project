package com.onetomany.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.onetomany.config.HibernateUtil;
import com.onetomany.dao.DepartmentDao;
import com.onetomany.entity.Department;
import com.onetomany.entity.Employees;

public class DepartmentDaoImpl implements DepartmentDao{
	
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction t = session.beginTransaction();


	@SuppressWarnings("deprecation")
	public void addDept() {
		
		Department d = new Department();
		d.setDid(1);
		d.setDname("IT");
		d.setDcity("kolkata");
		
		Employees e = new Employees();
		e.setEname("pritam");
		e.setEphone(891067633);
		e.setEmail("pritam@gmail.com");
		e.setEsalary(45635.50);
		e.setAddress("doulatabad");
		
		Employees e1 = new Employees();
		e1.setEname("sourav");
		e1.setEphone(259845544);
		e1.setEmail("sourav@gmail.com");
		e1.setEsalary(49785.50);
		e1.setAddress("usti");
		
		Employees e2 = new Employees();
		e2.setEname("Arnab");
		e2.setEphone(549495595);
		e2.setEmail("arnab@gmail.com");
		e2.setEsalary(94595.10);
		e2.setAddress("vidyanagar");
		
		
		List<Employees> al = new ArrayList<Employees>();
		al.add(e);
		al.add(e1);
		al.add(e2);
		
		d.setEmployees(al);
		
		session.save(d);
		t.commit();
		System.out.println("data inserted succesfully");
		
		
	}

}
