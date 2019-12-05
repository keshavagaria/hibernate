package com.csi.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateDemo {
public static void main(String[] args) {
	SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	Session session=factory.openSession();
	Transaction transaction=session.beginTransaction();
	
	Student s=new Student();
	s.setName("Ajay");
	s.setAddress("Pune");
	
	Student s2=new Student();
	s2.setName("Ankit");
	s2.setAddress("Indore");
	
	/*session.save(s);
	session.save(s2);
	*/
	Student s3=(Student)session.get(Student.class, 15);
	System.out.println(s3.getId()+" "+s3.getName()+" "+" "+s3.getAddress());
	transaction.commit();
	session.close();
}
}
