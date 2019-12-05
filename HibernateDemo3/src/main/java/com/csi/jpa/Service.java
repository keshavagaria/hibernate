package com.csi.jpa;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.Query;

//import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Service {

	private static SessionFactory factory;
public static void main(String[] args) {
	factory=new AnnotationConfiguration().configure().buildSessionFactory();
	Session session = factory.openSession();
	Transaction transaction=session.beginTransaction();
	
	//createTable();
	//deleteTable();
	//updateTable();
	getTable();
}

static void createTable() 
{
	Session session = factory.openSession();
	Transaction transaction=session.beginTransaction();
	Employee e=new Employee();
	e.setEmpName("Kunal");
	e.setEmpAddress("Rajasthan");
	e.setEmpContactNumber(9687456653L);
	e.setEmpSalary(27235.50);
	e.setEmpUID(896524444L);
	//e.setEmpDOB(Date.valueOf("1992-07-26"));
	try {
		e.setEmpDOB(new SimpleDateFormat("dd-MM-yyyy").parse("15-09-1990"));
	} catch (ParseException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	session.save(e);
	transaction.commit();
	session.close();
	
}
static void getTable()
{
	Session session = factory.openSession();
	Transaction transaction=session.beginTransaction();
	Query query=session.createQuery("from Employee");
	List<Employee> list=query.list();
	for(Employee emp:list)
	{
		System.out.println(emp);
	}
}
static void deleteTable()
{
	Session session = factory.openSession();
	Transaction transaction=session.beginTransaction();
	Employee emp=(Employee)session.get(Employee.class,6);
	session.delete(emp);
	transaction.commit();
	session.close();
}

static void updateTable()
{
	Session session = factory.openSession();
	Transaction transaction=session.beginTransaction();
	Employee emp2=(Employee)session.get(Employee.class,1);
	emp2.setEmpName("DAWOOD");
	session.update(emp2);
	transaction.commit();
	session.close();
}
}
