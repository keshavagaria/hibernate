package com.csi.dirty;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class Service {
public static void main(String[] args) {
	SessionFactory factory= new AnnotationConfiguration().configure().buildSessionFactory();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	
	/*Employee e=new Employee();
	e.setName("Keshav");*/
	Employee e=(Employee)session.get(Employee.class, 2);
	e.setName("Dawood");
	

	t.commit();
	session.close();
}
}
