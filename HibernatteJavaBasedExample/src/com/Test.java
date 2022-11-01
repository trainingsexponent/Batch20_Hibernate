package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	
	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session session = sf.openSession();
		
		Product product = new Product();
		product.setId(123);
		product.setName("Mobile");
		product.setPtype("Electronics");
		product.setPrice(25000);
		
		session.save(product);
		
		session.beginTransaction().commit();
	}

}
