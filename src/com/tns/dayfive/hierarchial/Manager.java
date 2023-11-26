package com.tns.dayfive.hierarchial;

public class Manager extends Citizen {

			private String mname;
			private float msalary;
			private String mdept;
			private String mlocation;
			
			
			public Manager() {
				
				mname="Anand";
				msalary=150000;
				mdept="Accounts";
				mlocation="Bangalore";
			}


			public Manager(String mname,float msalary,String mdept,String mlocation) {
				this.mname=mname;
				this.msalary=msalary;
				this.mdept=mdept;
				this.mlocation=mlocation;
			}


			public String getMname() {
				return mname;
			}


			public void setMname(String mname) {
				this.mname = mname;
			}


			public float getMsalary() {
				return msalary;
			}


			public void setMsalary(float msalary) {
				this.msalary = msalary;
			}


			public String getMdept() {
				return mdept;
			}


			public void setMdept(String mdept) {
				this.mdept = mdept;
			}


			public String getMlocation() {
				return mlocation;
			}


			public void setMlocation(String mlocation) {
				this.mlocation = mlocation;
			}


			@Override
			public String toString() {
				return "Manager [mname=" + mname + ", msalary=" + msalary + ", mdept=" + mdept + ", mlocation="
						+ mlocation + "]";
			}
		


			
}
