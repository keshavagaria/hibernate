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
	
	Employee e=new Employee();
	
	e.setName("Ravi");
	e.setAddress("Raipur");
	Integer id=(Integer) session.save(e);
	System.out.println("record added with id="+id);
	t.commit();
	
	session.close();
}
}
