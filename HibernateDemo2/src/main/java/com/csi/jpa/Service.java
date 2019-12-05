package com.csi.jpa;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Service {
	
	private static SessionFactory factory;
public static void main(String[] args) {
    factory=new AnnotationConfiguration().configure().buildSessionFactory();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	
	//Create
	Employee e=new Employee();
	e.setEmpName("Pinky");
	e.setEmpAddress("UP");
	e.setEmpContactNumber(3333333333L);
	e.setEmpSalary(6000.36f);
	session.save(e);
	
	//Retrieve
	//Employee emp1=(Employee)session.get(Employee.class, 1);
	Query q=session.createQuery("from Employee");
	List<Employee> list=q.list();
	//list.forEach(System.out::println);
	for(Employee emp:list)
	{
		System.out.println(emp);
	}
	/*//update
	Employee emp2=(Employee)session.get(Employee.class, 4);
	emp2.setEmpName("Rohit");
	session.update(emp2);
	
	//Delete
	Employee emp3=(Employee)session.get(Employee.class, 2);
	session.delete(emp3);*/
	
	t.commit();
	session.close();

	
	
}
}
