package com.csi.jpa;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Service {
public static void main(String[] args) {
	SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	/*
	Employee e=new Employee();
	e.setEmpName("Keshav");
	e.setEmpSalary(7000.50);
	
	Address a=new Address();
	a.setCity("Washington");
	a.setCountry("USA");
	
	Address a2=new Address();
	a2.setCity("Delhi");
	a2.setCountry("India");
	List<Address> list=new ArrayList<Address>();
	list.add(a);
	list.add(a2);
	
	e.setAddress(list);
	
	
	session.save(e);*/
	
	
	Employee emp=(Employee)session.get(Employee.class, 1);
	
	//System.out.println(emp.getAddress().size());

	t.commit();
	session.close();
}
}
