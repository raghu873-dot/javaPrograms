package com.net.Triple;

public class Int2 implements Intr1,Intr2{

	@Override
	public void m1() {
		Intr1.super.m1();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String args[]) {
		Int2 i=new Int2();
		i.m1();
	}


}
