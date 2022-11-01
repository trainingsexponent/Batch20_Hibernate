package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Employee employee = new Employee();
		employee.setEid(13);
		employee.setEname("Asdfg");
		employee.setEaddress("Pune");
		employee.setCname("Lnt");
		employee.setSalary(25000);
		
		//session.save(employee);
		session.saveOrUpdate(employee);
		session.beginTransaction().commit();
		
		System.out.println("Done");
		
		
//		Employee employee = session.get(Employee.class, 13);
//		System.out.println(employee);
//		
		
	}
}
