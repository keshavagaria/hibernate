package com.csi.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Service {
public static void main(String[] args) {
	SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	
	Vehicle v=new Vehicle();
	v.setVehiclename("Truck");
	
	TwoWheeler tw=new TwoWheeler();
	tw.setVehiclename("HayaBusa");
	tw.setSteeringHandle("HayaBusa HAndle");
	
	FourWheeler fw=new FourWheeler();
	fw.setVehiclename("BMW");
	fw.setSteeringWheel("BMW steering wheel");
	
	session.save(v);
	session.save(tw);
	session.save(fw);
	t.commit();
	session.close();
}
}
