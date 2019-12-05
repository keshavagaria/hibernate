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
	Session session = factory.openSession();
	Transaction t=session.beginTransaction();
	
	Answers a1=new Answers();
	a1.setName("Java is a Programming Language");
	
	Answers a2 =new Answers();
	a2.setName("Java is a platform");


	List<Answers> list1=new ArrayList<Answers>();
	list1.add(a1);
	list1.add(a2);
	Answers a3=new Answers();
	a3.setName("Servlet is an interface");
	
	Answers a4 =new Answers();
	a4.setName("Servlet is an api");
	
	List<Answers> list2=new ArrayList<Answers>();
	list2.add(a3);
	list2.add(a4);
	
	Questions q1=new Questions();
	q1.setQuestions("What is Java");
	
	List<Questions> list3=new ArrayList<Questions>();
	list3.add(q1);
	
	Questions q2=new Questions();
	q2.setQuestions("What is Servlet");
	
	List<Questions> list4=new ArrayList<Questions>();
	list4.add(q2);
	
	a1.setQ(list3);
	a2.setQ(list3);
	
	a3.setQ(list4);
	a4.setQ(list4);
	
	q1.setA(list1);
	q2.setA(list2);
	
	session.save(a1);
	session.save(a2);
	session.save(a3);
	session.save(a4);
	session.save(q1);
	session.save(q2);
	t.commit();
	session.close();
}
}
