package com.model;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class Test {
	
	public static void main(String[] args) {
		
		
		 SessionFactory sf = HibernateUtil.getSessionFactory();
		 
		 Session session = sf.openSession();
		 
//		 Employee employee = new Employee();
//		 
//		 employee.setId(3);
//		 employee.setName("Qwerty");
//		 employee.setAddress("Pune");
//		 employee.setSalary(29000);
//		
//		 session.save(employee);
//		 
//		 session.beginTransaction().commit();
		 
		 //select * from employee
		 CriteriaBuilder builder = session.getCriteriaBuilder();
		 CriteriaQuery<Employee> criteriaQuery = builder.createQuery(Employee.class);
		 
		 Root<Employee> root = criteriaQuery.from(Employee.class);
		 					   criteriaQuery.select(root);
		 
		 Query<Employee> query =  session.createQuery(criteriaQuery);
		 List<Employee> list = query.getResultList();
		 
		 System.out.println(list);
		 System.out.println("------------------------------------------------");
		 //select * from employee where id = ?
		 
		 CriteriaBuilder builder1 = session.getCriteriaBuilder();
		 CriteriaQuery<Employee> criteriaQuery1 = builder1.createQuery(Employee.class);
		 Root<Employee> root1 = criteriaQuery1.from(Employee.class);
		                        criteriaQuery1.select(root1).where(builder1.equal(root1.get("id"), 2));
		 
		 Query<Employee> query2 = session.createQuery(criteriaQuery1);
		 Employee employee =  query2.getSingleResult();
		 System.out.println(employee);
		 
		 System.out.println("--------------------------------------------------");
		 //select name from employee
		 CriteriaBuilder builder2 = session.getCriteriaBuilder();
		 CriteriaQuery<String> criteriaQuery2 = builder2.createQuery(String.class);
		 Root<Employee> root2 = criteriaQuery2.from(Employee.class);
		 	    	   	 	    criteriaQuery2.select(root2.get("name"));
		 	    	   	 	    
		 Query<String> query3 = session.createQuery(criteriaQuery2);
		 List<String> slist = query3.getResultList();
		 
		 System.out.println(slist);
		 
		 System.out.println("------------------------------------------------");
		 //select name,address,salary from employee
		 
		 CriteriaBuilder builder3 = session.getCriteriaBuilder();
		 CriteriaQuery<Object[]> criteriaQuery3 = builder3.createQuery(Object[].class);
		 
		 Root<Employee> root3 = criteriaQuery3.from(Employee.class);
		 	 	 	 	        criteriaQuery3.multiselect(root3.get("name"),root3.get("address"),root3.get("salary"));
	
	     Query<Object[]> query4 = session.createQuery(criteriaQuery3);
	     List<Object[]> objList = query4.getResultList();
	     
	     for(Object[] o : objList) {
	    	 //System.out.println(o.toString());
	    	 System.out.println("Name : " + o[0]);
	    	 System.out.println("Address : " + o[1]);
	    	 System.out.println("Salary : " + o[2]);
	     }
	}

}
