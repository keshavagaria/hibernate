package com.csi.jpa;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Service {
public static void main(String[] args) {
	SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	Session session=factory.openSession();
	Transaction transaction=session.beginTransaction();
	
	Employee e1=new Employee();
	e1.setName("Vishal");
	
	Employee e2=new Employee();
	e2.setName("Vishu");
	
	Address a1=new Address();
	a1.setCity("Delhi");
	a1.setCountry("India");
	
	Address a2=new Address();
	a2.setCity("Canberra");
	a2.setCountry("Australia");
	
	List<Address> list1=new ArrayList<Address>();
	list1.add(a1);
	list1.add(a2);
	

	Address a3=new Address();
	a3.setCity("Islamabad");
	a3.setCountry("Pakistan");
	
	Address a4=new Address();
	a4.setCity("Washington");
	a4.setCountry("USA");
	
	List<Address> list2=new ArrayList<Address>();
	list2.add(a3);
	list2.add(a4);
	
	e1.setAddress(list1);
	e2.setAddress(list2);
	
	session.save(e1);
	session.save(e2);
	transaction.commit();
	session.close();
}
}
