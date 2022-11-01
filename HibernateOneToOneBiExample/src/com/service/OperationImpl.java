package com.service;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.model.College;
import com.model.Student;
import com.util.HIbernateUtil;

public class OperationImpl implements OperationService{


	SessionFactory sf = HIbernateUtil.getSessionFactory();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addStudentWithCollege() {
		// TODO Auto-generated method stub
		Session	session = sf.openSession();

		Student student = new Student();
		College college = new College();

		System.out.println("Enter Student Name");
		student.setName(sc.next());

		System.out.println("Enter Student Address");
		student.setAddress(sc.next());

		System.out.println("Enter College Name");
		college.setCname(sc.next());

		student.setCollege(college);
		college.setStudent(student);

		session.save(college);
		session.save(student);

		session.beginTransaction().commit();
	}

	@Override
	public void showAllStudentData() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();

		Query<Student> query =  session.createQuery("from Student");
		List<Student> slist = query.getResultList();
		System.out.println(slist);
	}

	@Override
	public void addCollegeWithStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showCollegeData() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();

		Query<College> query =  session.createQuery("from College");
		List<College> clist = query.getResultList();
		for(College c : clist ) {
			System.out.println(c.getCid());
			System.out.println(c.getCname());
			System.out.println(c.getStudent().getSid());
			System.out.println(c.getStudent().getName());
			System.out.println(c.getStudent().getAddress());
		}
		
	}

}
