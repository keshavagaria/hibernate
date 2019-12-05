package com.csi.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import sun.reflect.annotation.AnnotatedTypeFactory;

public class Service {
public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	
	/*Employee e=new  Employee();
	e.setName("Keshav");
	e.setAddress("Bihar");*/
	
	Employee emp=(Employee)session.get(Employee.class, 2);
	//emp.setAddress("UP");
	session.update(emp);
	
	
	t.commit();
	session.close();
	
	
	
	Session session2=factory.openSession();
	Transaction t2=session2.beginTransaction();
	Employee emp2=(Employee)session2.get(Employee.class, 2);
	session2.update(emp2);
	t2.commit();
	session2.close();
}
}
