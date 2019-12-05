package com.csi.jpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Service {
public static void main(String[] args) {
	SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	Session session=factory.openSession();
	Transaction transaction=session.beginTransaction();
	
	Answer a1=new Answer();
	a1.setAnswer("Java is a programming language");
	
	Answer a2=new Answer();
	a2.setAnswer("Java is a platform");
	
	Question q=new Question();
	q.setQuestion("What is java");
	q.setAns(a1);
	q.setAns(a2);
	
	a1.setQues(q);
	a2.setQues(q);
	
	session.save(a1);
	session.save(a2);
	session.save(q);
	
	transaction.commit();
	session.close();
	
}
}
