package com.csi.hibernate;

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
	
	//Employee e=new Employee();
	/*e.setName("Ankit");
	e.setAddress("Indore");*/
	
	Query q=session.getNamedQuery("findByName");
	q.setParameter("n", "Vishal");
	List<Employee>list=q.list();
	
	for(Employee e:list)
	{
	System.out.println(list);
	}	
	//session.save(e);
	t.commit();
	session.close();
	
}
}
