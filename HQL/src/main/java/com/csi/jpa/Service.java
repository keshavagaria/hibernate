package com.csi.jpa;

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
	Transaction transaction=session.beginTransaction();
	
/*	Employee e=new Employee();
	//e.setName("Arun");
	//e.setAddress("Punjab");
	*/
	//HQL-Retrieve
	/*Query q=session.createQuery("from Employee");
	List<Employee> emp=q.list();
	for(Employee e:emp)
	{
		System.out.println(e.getId()+" "+e.getName()+" "+e.getAddress());
	}*/
	
	//HQL-Update
	/*Query q=session.createQuery("update Employee set name=:n, address=:a where id=:i");
	q.setParameter("n","Dawood");
	q.setParameter("a", "Pakistan");
	q.setParameter("i", 3);
	
	int status=q.executeUpdate();
	System.out.println(status);*/
	
	//HQL-Delete
	/*Query q=session.createQuery("delete from Employee where id=2");
	System.out.println(q.executeUpdate());*/
	//session.save(e);
	
	//HQL-Pagination
	/*Query q=session.createQuery("from Employee");
	q.setFirstResult(3);
	q.setMaxResults(3);
	
	List<Employee>e=q.list();*/
	
	/*//HQL-CREATE
	Query q=session.createQuery("insert into employee(id,name,address) values(?,?,?)");
	q.setParameter(1, 2);
	q.setParameter(2, "Chennai");
	q.setParameter(3, "DHONI");
	int status=q.executeUpdate();
	System.out.println("record inserted "+status);*/
	/*for(Employee emp:e)
	{
		System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getAddress());
	}*/
	
	transaction.commit();
	session.close();
}
}
