package com.tnsif.dayone;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student Name");
		String name = sc.nextLine();
		System.out.println("Enter student USN");
		String usn = sc.nextLine();
		System.out.println("Enter student Address");
		String address = sc.nextLine();
		System.out.println("Enter student Contact Number");
		int contact= sc.nextInt();
		System.out.println("The student details are");
		System.out.println("Name "+ name);
		System.out.println("USN "+ usn);
		System.out.println("Address"+ address);
		System.out.println("Contact "+ contact);
		sc.close();
	}

}