package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	
	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session session = sf.openSession();
		
		Student student = new Student();
		student.setName("Abcd");
		student.setAddress("Pune");
		
		College college = new College();
		college.setCname("COEP");
		college.setCcode("COEP1");
		
		session.save(student);
		session.save(college);
		
		session.beginTransaction().commit();
	}

}
