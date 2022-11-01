package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	
	public static void main(String[] args) {
		
		SessionFactory sf = HibenrateUtil.getSessionFactory();
		
		Session session = sf.openSession();
//		
//		Product product = new Product();
//		product.setpName("T-Shirts");
//		product.setPrice(1500);
//
//		session.save(product);
//		session.beginTransaction().commit();
		
		Product product = session.get(Product.class, 1);
		System.out.println(product);
		
		System.out.println("============================================");
		
		Session session1 = sf.openSession();
		Product product1 = session1.get(Product.class, 1);
		System.out.println(product1);
	}

}
