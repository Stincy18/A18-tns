package com.tnsif.dayone;

import java.util.Scanner;

public class SecondProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,result;
		System.out.println("Enter two numbers");
		
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		result = a+b;
		System.out.println("Addition :" +result);
		result = a-b;
		System.out.println("Subtraction :" +result);
		result = a*b;
		System.out.println("Multiplication :" +result);
		result = a/b;
		System.out.println("Division :" +result);

	}

}