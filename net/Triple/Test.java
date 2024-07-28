package com.net.Triple;

public class Test {

	public static void main(String[] args) {

		Child c=new Child();
		c.meth();
	}

}

 class Parent{
	int i=25;
}
 
 class Child extends Parent{
	 void meth() {
		 int i=55;
		 
		 System.out.println(i);
		 System.out.println(this.i);
		 System.out.println(super.i);
		 
	 }
		
	}