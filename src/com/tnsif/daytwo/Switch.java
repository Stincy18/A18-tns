package com.tnsif.daytwo;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 44;
	    String size;
	    switch (number) {

	      case 29:
	        size = "Small";
	        break;

	      case 42:
	        size = "Medium";
	        break;
	      case 44:
	        size = "Large";
	        break;

	      case 48:
	        size = "Extra Large";
	        break;
	      
	      default:
	        size = "Unknown";
	        break;

	    }
	    System.out.println("Size: " + size);
	  }
	}

