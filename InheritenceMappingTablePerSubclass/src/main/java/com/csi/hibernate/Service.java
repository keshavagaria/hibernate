package com.csi.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Service {
public static void main(String[] args) {
	SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	
	Vehicle v=new Vehicle();
	v.setVehicleName("Rocket");
	
	TwoWheeler tw=new TwoWheeler();
	tw.setVehicleName("HayaBusa");
	tw.setSteeringHandle("HayaBusa Steering Handle");
	
	FourWheeler fw=new FourWheeler();
	fw.setVehicleName("Mercedes");
	fw.setSteeringWheel("Mercedes Steering Wheel");
	
	session.save(v);
	session.save(tw);
	session.save(fw);
	t.commit();
	session.close();
}
}
