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
	a.setCity("Delhi");
	a.setCountry("India");
	
	
	Employee e=new Employee();
	e.setName("Vishal");
	e.setAddress(a);
	a.setEmployee(e);
	session.save(e);
	session.save(a);
	
	/*Employee emp=(Employee) session.get(Employee.class, 1);
	System.out.println(emp);*/
	t.commit();
	session.close();
}
}
