package com.tns.dayfour.packageone;

public class Example {

	public static void main(String[] args) {

				Sample s1=new Sample();
				s1.methodDefault();
				s1.methodProtected();
				s1.methodPublic();
				
				s1.varDefault=1000;
				s1.methodDefault();
				
				//private member can't accessible
				/*b1.varPrivate=21; 
				b1.methodPrivate();*/
				
				s1.varProtected=3000;
				s1.methodProtected();
				
				s1.varPublic=40000;
				s1.methodPublic();
				
				//instance of operator
				System.out.println(s1 instanceof Sample); //returns True
		       

			}

		
	}


