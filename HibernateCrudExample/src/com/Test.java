package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class Test {
	
	public static void main(String[] args) {
		
		SessionFactory sf = HibenrateUtil.getSessionFactory();
		
		Session session = sf.openSession();
		
//		Product product = new Product();
//		
//		product.setPname("Laptop");
//		product.setPtype("Elec");
//		product.setPrice(55000);
//		
//	    session.save(product);	
//	    
//	    session.beginTransaction().commit();
	    
	    //select * from product
//		Query<Product> query = session.createQuery("from Product");
//		List<Product> plist = query.getResultList();
//		System.out.println(plist);
//		
//		//select * from product where id=?
//		Session session2 = sf.openSession();
//		Product product = session2.get(Product.class, 1);
//		System.out.println(product);
//		
//		product.setPname("Apple");
//		product.setPrice(50000);
//		session2.update(product);
//		session2.beginTransaction().commit();
		
		
		Session session3 = sf.openSession();
//		Product product1 = session3.get(Product.class, 2);
//		System.out.println(product1);
//		
//		session3.delete(product1);
//		session3.beginTransaction().commit();
		
		session3.beginTransaction();
		Query<Product> query2 = session3.createSQLQuery("drop table product");
		query2.executeUpdate();
	}

}
