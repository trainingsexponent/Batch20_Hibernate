package com.sevice;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.model.AadharCard;
import com.model.Person;
import com.util.HibernateUtil;

public class OperationImpl implements Operation{

	SessionFactory sf =  HibernateUtil.getSessionFactory();
	Scanner sc = new Scanner(System.in); 


	@Override
	public void addPersonWithAadharCardData() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();

		Person person = new Person();
		AadharCard aadharCard = new AadharCard();

		System.out.println("Enter Person Name : ");
		person.setPname(sc.next());

		System.out.println("Enter Person Address  :  ");
		person.setAddress(sc.next());

		System.out.println("Enter Aadhar No : ");
		aadharCard.setaNo(sc.nextLong());

		System.out.println("Enter Officer Name : ");
		aadharCard.setNameOfOfficer(sc.next());

		person.setAadharCard(aadharCard);

		session.save(person);

		session.beginTransaction().commit();
		System.out.println("Data Added...!");

	}

	@Override
	public void showAllPersonData() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();

		Query<Person> query = session.createQuery("from Person");
		List<Person> plist = query.getResultList();
		System.out.println(plist);
	}

	@Override
	public void getSinglePersonData() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();

		System.out.println("Enter  Perosn Id : " );
		int id = sc.nextInt();
		Person person = session.get(Person.class, id);
		if(person != null) {
			System.out.println(person);
		} else {
			System.out.println("Person Id not found");
		}
	}

	@Override
	public void updatePersonData() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();

		System.out.println("Enter  Perosn Id : " );
		int id = sc.nextInt();
		Person person = session.get(Person.class, id);
		if(person != null) {
			
			System.out.println("Enter Person Name : ");
			person.setPname(sc.next());

			System.out.println("Enter Person Address  :  ");
			person.setAddress(sc.next());
			
			session.update(person);
			session.beginTransaction().commit();
			
		} else {
			System.out.println("Person Id not found");
		}
	}

	@Override
	public void UpdateAadharData() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePerson() {
		// TODO Auto-generated method stub

	}

}
