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
	v.setName("Aeroplane");
	
	TwoWheeler tw=new TwoWheeler();
	tw.setName("HayaBusa");
	tw.setSteeringHandle("i have a steering handle");
	
	FourWheeler fw=new FourWheeler();
	fw.setName("Audi");
	fw.setSteeringWheel("i am having a steering wheel");
	
	session.save(v);
	session.save(tw);
	session.save(fw);
	t.commit();
	session.close();
}
}
