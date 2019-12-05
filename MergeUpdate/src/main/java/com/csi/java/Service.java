package com.csi.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Service {
public static void main(String[] args) {
	SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	
/*	Employee e=new Employee();
	e.setId("F");
	e.setName("Falguni");*/
	
	Employee e=(Employee)session.get(Employee.class, "F");
t.commit();
	session.close();
	e.setName("Fatima");
	
	Session session2=factory.openSession();
	Transaction t2=session2.beginTransaction();
	Employee e2=(Employee)session.get(Employee.class, "F");

	session2.merge(e);
	t2.commit();
	session2.close();
}
}
