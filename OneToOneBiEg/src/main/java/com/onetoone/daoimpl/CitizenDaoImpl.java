package com.onetoone.daoimpl;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.onetoone.config.HibernateUtil;
import com.onetoone.dao.CitizenDao;
import com.onetoone.entity.Address;
import com.onetoone.entity.Citizen;


public class CitizenDaoImpl implements CitizenDao{
	
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction t = session.beginTransaction();

	@SuppressWarnings("deprecation")
	@Override
	public void addCitizen() {
		
		Citizen c=new Citizen();
		
		c.setCname("Sourav");
		c.setSurname("Sanfui");
		c.setPhone(891225445);
		c.setEmail("s@gmail.com");
		c.setDob("27-09-2022");
		
		Address a=new Address();
		a.setIdnumber(10254);
		a.setIdtype("PAN");
		a.setAddress("usti");
		a.setCity("kolkata");
		a.setState("WB");
		a.setPincode(743513);
		
		a.setCitizen(c);
		c.setAddress(a);
		
		session.save(c);
		t.commit();
		System.out.println("Data inserted succesfully");
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void fetchCitizen() {
		
		@SuppressWarnings("rawtypes")
		Query q = session.createQuery("from Citizen");
		
		//List with citizen entity
		@SuppressWarnings("unchecked")
		List<Citizen> al = q.getResultList();
		
		//traverse
		Iterator<Citizen> itr = al.iterator();
		while(itr.hasNext()) {
			
			Citizen c1= itr.next();
			Address a1= c1.getAddress();

			System.out.println(a1.getIdnumber()+" "+a1.getIdtype()+" "+a1.getAddress()+" "+a1.getCity()+" "+a1.getState()+" "+a1.getPincode());
			System.out.println(c1.getCid()+" "+c1.getCname()+" "+c1.getSurname()+" "+c1.getEmail()+" "+c1.getPhone());
			
			
		}
		
	}

}
