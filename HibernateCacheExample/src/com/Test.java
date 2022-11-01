package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
	
	public static void main(String[] args) {
	
	 SessionFactory sf = HibernateUtil.getSessionFactory();	
	 
	 Session session = sf.openSession();
	 
//	 Company company = new Company();
//	 company.setName("Infosys");
//	 company.setAddress("Hinjewadi");
//	 
//	 session.save(company);
//	 
//	 session.beginTransaction().commit();
//	 System.out.println("Data Stored....!");
	 
	 Company company = session.get(Company.class, 1);
	 System.out.println(company);
	 //to remove first level perticular object.
	 session.evict(company);
	 System.out.println("==========================================");
	 Company company2 = session.get(Company.class, 1);
	 System.out.println(company2);
	 
	 
	}

}
