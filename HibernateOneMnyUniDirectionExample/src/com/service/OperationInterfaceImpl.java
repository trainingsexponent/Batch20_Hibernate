package com.service;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.model.Customer;
import com.model.Product;
import com.util.HibernateUtil;

public class OperationInterfaceImpl implements OperationInterface{

	SessionFactory sf = HibernateUtil.getSessionFactory();
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void addCustomerWithMultipleProduct() {
		// TODO Auto-generated method stub
	 Customer customer = new Customer();
	 System.out.println("Enter Customer Name : ");
	 customer.setName(sc.next());
	 
	 System.out.println("How Many Product to be buy : ");
	 int n = sc.nextInt();

	 for (int i = 0; i < n; i++) {
		Product product = new Product();
		System.out.println("Enter Prodcut name : ");
		product.setPname(sc.next());
		System.out.println("Enter Product Price : ");
		product.setPrice(sc.nextDouble());
		customer.getPlist().add(product);
	}
	 Session session = sf.openSession();
	 session.save(customer);
	 session.beginTransaction().commit();
		
	}

	@Override
	public void ShowAllCustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getSingleCustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePerticularProductUsingCustomer() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		System.out.println("Enter Customer Id : ");
		int id = sc.nextInt();
		Customer customer = session.get(Customer.class, id);
		
		Product product = null;
		boolean flag =  false;
		
		if(customer != null) {
			System.out.println(customer);
			List<Product> plist = customer.getPlist();
			System.out.println("Enter Product Id : ");
			int pid = sc.nextInt();
			
			for(Product p : plist) {
				
				if(p.getPid() == pid) {
					product = p ;
					flag = true;
					break;
				}
			}
			
			if(flag) {
				System.out.println("Enter Prodcut name : ");
				product.setPname(sc.next());
				System.out.println("Enter Product Price : ");
				product.setPrice(sc.nextDouble());
				
				customer.getPlist().add(product);
				
				session.update(customer);
				session.beginTransaction().commit();
			}
		}
		else {
			System.out.println("Customer Not Found");
		}
		
	}

	@Override
	public void deletePerticularProductUsingCustomer() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		System.out.println("Enter Customer Id : ");
		int id = sc.nextInt();
		Customer customer = session.get(Customer.class, id);
		
		Product product = null;
		boolean flag =  false;
		
		if(customer != null) {
			System.out.println(customer);
			List<Product> plist = customer.getPlist();
			System.out.println("Enter Product Id : ");
			int pid = sc.nextInt();
			
			for(Product p : plist) {
				
				if(p.getPid() == pid) {
					product = p ;
					flag = true;
					break;
				}
			}
			
			if(flag) {
				plist.remove(product);
				customer.setPlist(plist);
				session.update(customer);
				session.delete(product);
				session.beginTransaction().commit();
			}
		}
		else {
			System.out.println("Customer Not Found");
		}
		
	}

}
