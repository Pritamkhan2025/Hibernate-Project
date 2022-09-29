package com.tph.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tph.config.HibernateUtil;
import com.tph.dao.VehicleDao;
import com.tph.entity.FourWheel;
import com.tph.entity.TwoWheel;

public class VehicleDaoImpl implements VehicleDao{
	
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction t = session.beginTransaction();

	@SuppressWarnings("deprecation")
	@Override
	public void addVehicle() {
		
		TwoWheel tw=new TwoWheel();
		tw.setFuel("petrol");
		tw.setEngine("500cc");
		tw.setSpeed(150);
		tw.setVtype("Bike");
		tw.setPrice(200000);
		tw.setModelno(1234);
		tw.setModelname("BMW");
		tw.setAbs(true);
		tw.setTyretype(120);
		tw.setBtype("Adventure bike");
		
		FourWheel fw=new FourWheel();
		fw.setFuel("Electric");
		fw.setEngine("25KW");
		fw.setSpeed(250);
		fw.setVtype("Car");
		fw.setPrice(6500000);
		fw.setModelno(2534);
		fw.setModelname("Tesla");
		fw.setMusicsystem(true);
		fw.setEtype("automatic");
		fw.setAc(true);
		
		session.save(fw);
		session.save(tw);
		
		t.commit();
		System.out.println("Data added succesfully");
		
	}

}
