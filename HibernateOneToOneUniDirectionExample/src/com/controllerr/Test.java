package com.controllerr;

import java.util.Scanner;

import com.sevice.Operation;
import com.sevice.OperationImpl;

public class Test {
	
	public static void main(String[] args) {
		
		
		Operation op = new OperationImpl();
		
		Scanner sc =new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Add Person Data with AadharCard Data");
			System.out.println("2. Show All Table Data");
			System.out.println("3. Get Single PersonData Using Person Id");
			System.out.println("4. Update Only Person Data");
			System.out.println("5. Update AadharCard Data Using Person Id");
			System.out.println("6. Delete Person Data");
			
			int ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				op.addPersonWithAadharCardData();
				break;
			case 2:
				op.showAllPersonData();
				break;
			case 3:
				op.getSinglePersonData();
				break;
			case 4:
				op.updatePersonData();
				break;
			case 5:
				op.UpdateAadharData();
				break;
			case 6:
				op.deletePerson();
				break;

			default:
				break;
			}
		}
		
	}

}
