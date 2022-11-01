package com.identity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory sf = HbUtil.getSessionFactory();
		
		Session session = sf.openSession();
		
		Customer customer = new Customer();
		customer.setCname("QBCD");
		customer.setcMobileNo("(+91) 541289987");
		
		Product product = new Product();
		product.setPname("Buds");
		product.setPrice(2500);
		
		session.save(product);
		session.save(customer);
		
		//session.beginTransaction().commit();
		
		//session = sf.getCurrentSession();
		 
		Session session1 = sf.openSession();
		Customer customer1 = new Customer();
		customer1.setCname("PQRS");
		customer1.setcMobileNo("(+91) 541289987");
		
		Product product1 = new Product();
		product1.setPname("GLASS");
		product1.setPrice(2500);
		
		session1.save(product1);
		session1.save(customer1);
		
		session1.beginTransaction().commit();
		
		
	}
}
