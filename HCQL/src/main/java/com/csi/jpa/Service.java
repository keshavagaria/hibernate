package com.csi.jpa;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Service {
public static void main(String[] args) {
	SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	
	/*Employee e=new Employee();
	e.setName("Kishore");
	
	session.save(e);*/
	//HCQL-Retrieve
	/*Criteria criteria=(Criteria)session.createCriteria(Employee.class);
	List<Employee>e=criteria.list();
	for(Employee emp:e)
	{
		System.out.println(emp.getId()+" "+emp.getName());
	}*/
	
	//HCQL-get record > 3
	/*Criteria c=session.createCriteria(Employee.class);
	c.add(Restrictions.ne("id",3));
	List<Employee>list=c.list();
	for(Employee emp:list)
	{
		System.out.println(emp.getId()+" "+emp.getName());
	}*/
	//HCQL-order asc desc
	/*Criteria c=session.createCriteria(Employee.class);
	c.addOrder(Order.desc("name"));
	List<Employee> list=c.list();
	for(Employee e:list)
	{
		System.out.println(e.getId()+" "+e.getName());
	}*/
	//HCQL-Pagination
	/*Criteria criteria=session.createCriteria(Employee.class);
	criteria.setFirstResult(1);
	criteria.setMaxResults(2);
	List<Employee>emp=criteria.list();
	for(Employee e:emp)
	{
		System.out.println(e.getId()+" "+e.getName());
	}*/
	
	//HCQL-Projections
	/*Criteria criteria=session.createCriteria(Employee.class);
	//criteria.setProjection(Projections.property("id"));
	criteria.setProjection(Projections.count("id"));
	List<Long>list=criteria.list();
	for(Long e:list)
	{
		System.out.println(e);
	}*/
	
	//HCQL->update
	
	//HCQL->delete
	t.commit();
	session.close();
}
}
