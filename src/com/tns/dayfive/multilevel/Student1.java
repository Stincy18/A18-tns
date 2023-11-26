package com.tns.dayfive.multilevel;


public class Student1 extends Teacher {

	
	private String student_name;
	private int student_class;
	private int student_rollno;
	private float student_marks;
	
	
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getStudent_class() {
		return student_class;
	}
	public void setStudent_class(int student_class) {
		this.student_class = student_class;
	}
	public int getStudent_rollno() {
		return student_rollno;
	}
	public void setStudent_rollno(int student_rollno) {
		this.student_rollno = student_rollno;
	}
	public float getStudent_marks() {
		return student_marks;
	}
	public void setStudent_marks(float student_marks) {
		this.student_marks = student_marks;
	}
	@Override
	public String toString() {
		return "Student1 [student_name=" + student_name + ", student_class=" + student_class + ", student_rollno="
				+ student_rollno + ", student_marks=" + student_marks + ", getTeacher_name()=" + getTeacher_name()
				+ ", getTeacher_phno()=" + getTeacher_phno() + ", getSubject()=" + getSubject() + ", getSchool_name()="
				+ getSchool_name() + ", getSchool_syallabus()=" + getSchool_syallabus() + ", getSchool_address()="
				+ getSchool_address() + "]";
	}
	

	
	}
		
