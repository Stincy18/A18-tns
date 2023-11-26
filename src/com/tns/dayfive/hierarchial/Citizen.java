package com.tns.dayfive.hierarchial;

public class Citizen {
	
		private String name;
		private int aadharno;
		private String city;
		private long phno;

		public Citizen() {

			name="Sham";
			aadharno=895656562;
			city="Pune";
			phno=986523142;
		}

		public Citizen(String name,int aadharno, String city,long phno) {
			this.name = name;
			this.aadharno=aadharno;
			this.city=city;
			this.phno=phno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAadharno() {
			return aadharno;
		}

		public void setAadharno(int aadharno) {
			this.aadharno = aadharno;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public long getPhno() {
			return phno;
		}

		public void setPhno(long phno) {
			this.phno = phno;
		}

		@Override
		public String toString() {
			return "Citizen [name=" + name + ", aadharno=" + aadharno + ", city=" + city + ", phno=" + phno + "]";
		}
	}

