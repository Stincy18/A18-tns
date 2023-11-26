package com.tns.dayfour.singlelevel;

public class Person1 extends Bank1 {
	
		
		private String pname;
		private long phno;
		private String plocation;
		

		public Person1(String pname, long phno, String plocation) {
			
			this.pname = pname;
			this.phno= phno;
			this.plocation= plocation;
		}


		public String getName() {
			return pname;
		}


		public void setName(String pname) {
			this.pname = pname;
		}


		public long getPhno() {
			return phno;
		}


		public void setPhno(long phno) {
			this.phno = phno;
		}


		public String getpLocation() {
			return plocation;
		}


		public void setpLocation(String plocation) {
			this.plocation = plocation;
		}


		@Override
		public String toString() {
			return "Person1 [pname=" + pname + ", phno=" + phno + ", plocation=" + plocation + ", getBankId()="
					+ getBankId() + ", getBankName()=" + getBankName() + ", getBranch()=" + getBranch()
					+ ", getAddress()=" + getAddress() + "]";
		}




		}
		
		
