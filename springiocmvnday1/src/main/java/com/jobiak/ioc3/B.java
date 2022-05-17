package com.jobiak.ioc3;

public class B {
	public void printingDesign() {
		A a=new A();//dependency
		a.print();  //1.They cause maintaince nightmare
		            //2.Testing
	}

}
