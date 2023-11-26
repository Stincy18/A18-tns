package com.tns.dayfive.hierarchial;

public class Employee extends Citizen {
	
		private int empId;
		private String empDept;
		private int empSalary;
		public Employee() {
			
			empId=101;
			empDept="Accounts";
			empSalary=30000;
		}
		public Employee(int empId,String empDept,int empSalary) {
			this.empId=empId;
			this.empDept=empDept;
			this.empSalary=empSalary;
		}
		
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpDept() {
			return empDept;
		}
		public void setEmpDept(String empDept) {
			this.empDept = empDept;
		}
		public int getEmpSalary() {
			return empSalary;
		}
		public void setEmpSalary(int empSalary) {
			this.empSalary = empSalary;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empDept=" + empDept + ", empSalary=" + empSalary + ", getName()="
					+ getName() + ", getAadharno()=" + getAadharno() + ", getCity()=" + getCity() + ", getPhno()="
					+ getPhno() + "]";
		}
				
	}

