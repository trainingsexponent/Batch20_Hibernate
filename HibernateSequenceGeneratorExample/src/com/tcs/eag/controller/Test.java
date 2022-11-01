package com.tcs.eag.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tcs.eag.model.Country;
import com.tcs.eag.util.HbUtil;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory sf = HbUtil.getSessionFactory();
		
		Session session = sf.openSession();
		
		Country country = new Country();
		country.setCname("India");
		country.setCode(+91);
		
		session.save(country);
		session.beginTransaction().commit();
		System.out.println("Done");
	}
}
