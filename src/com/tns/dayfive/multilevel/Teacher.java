package com.tns.dayfive.multilevel;


public class Teacher extends School {

	
		private String teacher_name;
		private int teacher_phno;
		private String subject;
	
		
		public String getTeacher_name() {
			return teacher_name;
		}
		public void setTeacher_name(String teacher_name) {
			this.teacher_name = teacher_name;
		}
		public int getTeacher_phno() {
			return teacher_phno;
		}
		public void setTeacher_phno(int teacher_phno) {
			this.teacher_phno = teacher_phno;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		
		
		@Override
		public String toString() {
			return "Teacher [teacher_name=" + teacher_name + ", teacher_phno=" + teacher_phno + ", subject=" + subject
					+ "]";
		}
			
		
		
}
