package com.model;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	
	public static void main(String[] args) {
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		
		Session session = sf.openSession();
		
		session.beginTransaction();
		
//		Company company = new Company();
//		company.setCid(125);
//		company.setCname("Tcs");
//		company.setCaddress("Pune");
//		
//		Query query = session.getNamedNativeQuery("insert");
//		query.setParameter(1, company.getCid());
//		query.setParameter(2, company.getCname());
//		query.setParameter(3, company.getCaddress());
//		
//		query.executeUpdate();
		
		System.out.println("Done");
		System.out.println("-----------------------------------------------");
		
		org.hibernate.query.Query<Company> query2 =  session.createNamedQuery("AllData");
		List<Company> clist = query2.getResultList();
		System.out.println(clist);
		
		System.out.println("-----------------------------------------------");
		
//		org.hibernate.query.Query<Company> query3 =  session.createNamedQuery("updateData");
//		query3.setParameter(1, "Congnizant");
//		query3.setParameter(2, "Hinjewad ph 3");
//		query3.setParameter(3, 123);
		
//		query3.executeUpdate();
//		session.getTransaction().commit();
//		System.out.println("Done");
		
		System.out.println("---------------------------------------------------------");
		org.hibernate.query.Query<Company> query4 =  session.createNamedQuery("AllDataDesc");
		List<Company> clist1 = query4.getResultList();
		System.out.println(clist1);
		
	}

}
