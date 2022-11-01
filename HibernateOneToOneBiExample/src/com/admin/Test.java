package com.admin;

import java.util.Scanner;

import com.service.OperationImpl;
import com.service.OperationService;

public class Test {

	public static void main(String[] args) {

		OperationService op = new OperationImpl();
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("1. Add Student With College Data");
			System.out.println("2. Show All Student Data with College Data");
			System.out.println("3. Add College Data With Student Data");
			System.out.println("4. Show All College Data With Student");

			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				op.addStudentWithCollege();
				break;
			case 2:
				op.showAllStudentData();
				break;
			case 3:
				op.addCollegeWithStudent();
				break;
			case 4:
				op.showCollegeData();
				break;
			default:
				break;
			}
		}

	}

}
