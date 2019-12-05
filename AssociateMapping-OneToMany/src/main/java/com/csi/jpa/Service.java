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
	Transaction t=session.beginTransaction();
	
	Address a1=new Address();
	a1.setCountry("America");
	

	Address a2=new Address();
	a2.setCountry("Canada");
	
	List<Address> list=new ArrayList<Address>();
	list.add(a1);
	list.add(a2);
	
	Employee e=new Employee();
	e.setEmpName("Vishal");
	e.setAddress(list);
	a1.setEmp(e);
	a2.setEmp(e);
	
	session.save(e);
	session.save(a1);
	session.save(a2);
	
	t.commit();
	session.close();
}
}
