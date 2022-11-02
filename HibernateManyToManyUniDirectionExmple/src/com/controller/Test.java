package com.controller;

import java.util.Scanner;

import com.service.ServiceI;
import com.service.ServiceImpl;

public class Test {

	public static void main(String[] args) {


		ServiceI s = new ServiceImpl();
		Scanner sc =new Scanner(System.in);

		while (true) {
			System.out.println("1. Add Employee With Multiple HrEmployee");
			System.out.println("2. Show All Employee");
			System.out.println("3. Get Single Employee");
			System.out.println("4. Update Only Emplpyee");
			System.out.println("5. Update Perticular HrEmployee");

			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				s.AddEmployeeWithHrEmployee();
				break;
			case 2:
				s.showAllEmployee();
				break;
			case 3:
				s.getSingleEmployee();
				break;
			case 4:
				s.updateEmployee();
				break;
			case 5:
				s.updatePerticularHrUsingEid();
				break;
			default:
				break;
			}
		}


	}

}
