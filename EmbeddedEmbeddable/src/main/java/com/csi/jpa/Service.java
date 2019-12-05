package com.csi.jpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Service {
public static void main(String[] args) {
	SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	
	Address a=new Address();
	a.setState("Maharashtra");
	a.setCapital("Mumbai");
	
	Address a2=new Address();
	a2.setState("UP");
	a2.setCapital("Lucknow");
	
	Employee e=new Employee();
	e.setName("Vishal");
	e.setHomeAddress(a2);
	e.setOfficeAddress(a);
	session.save(e);
	t.commit();
	session.close();
}
}
