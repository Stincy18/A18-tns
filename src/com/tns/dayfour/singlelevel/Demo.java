package com.tns.dayfour.singlelevel;

public class Demo {

	public static void main(String[] args) {
				
		Person1 p1 = new Person1("divya",653298145,"Bangalore");
		
		p1.setName("Divya");
		p1.setPhno(653298145);
		p1.setpLocation("Bangalore");		
		p1.setBankId(20);
        p1.setBankName("SBI");
	    p1.setBranch("Rt nagar");
        p1.setAddress("Bangalore");

        System.out.println(p1);

}
}