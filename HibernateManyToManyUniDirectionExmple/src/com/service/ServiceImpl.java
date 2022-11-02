package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Employee;
import com.model.HrEmployee;
import com.util.HibernateUtil;

public class ServiceImpl implements ServiceI{

	SessionFactory sf = HibernateUtil.getSessionFactory();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void AddEmployeeWithHrEmployee() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		List<HrEmployee> hrList = new ArrayList<HrEmployee>();
		
		Employee employee = new Employee();
		
		System.out.println("Enter Employee Name : ");
		employee.setEname(sc.next());
		
		System.out.println("Enter Employee Desig. : ");
		employee.setDesignation(sc.next());
		
		System.out.println("How Many Hr Allocating : ");
		int n = sc.nextInt();
		
		for(int i =0 ; i < n ; i++) {
			HrEmployee hr =  new HrEmployee();
	
			System.out.println("Enter Hr Name : ");
			hr.setHname(sc.next());
			
			System.out.println("Enter Hr Desig .: ");
			hr.setHdesignation(sc.next());
			
			hrList.add(hr);
			
		}
		
		employee.setHrEmployee(hrList);
		
		session.save(employee);
		session.beginTransaction().commit();
	}

	@Override
	public void showAllEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getSingleEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePerticularHrUsingEid() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllDataOfEmployeeWhoseDesignation() {
		// TODO Auto-generated method stub
		
	}

}
