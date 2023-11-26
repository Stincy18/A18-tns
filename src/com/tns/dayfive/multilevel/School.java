package com.tns.dayfive.multilevel;


public class School {

	
		private String school_name;
		private String school_syallabus;
		private String school_address;
	
		
		public String getSchool_name() {
			return school_name;
		}
		public void setSchool_name(String school_name) {
			this.school_name = school_name;
		}
		public String getSchool_syallabus() {
			return school_syallabus;
		}
		public void setSchool_syallabus(String school_syallabus) {
			this.school_syallabus = school_syallabus;
		}
		public String getSchool_address() {
			return school_address;
		}
		public void setSchool_address(String school_address) {
			this.school_address = school_address;
		}
		
		
		
		@Override
		public String toString() {
			return "School [school_name=" + school_name + ", school_syallabus=" + school_syallabus + ", school_address="
					+ school_address + "]";
		}
		
		
}
