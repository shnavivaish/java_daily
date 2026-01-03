package com.polymorphism;

public class OverridiMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p=new Parent1();
		p.disp();
		Child1 c=new Child1();
		c.disp();
		Parent1 ref=new Child1();
		ref.disp();        

	}

}
class Parent1{
	 void disp() {          // static method will not store in object in heap as it take place in static segment 
		System.out.println("this is parent");	}
	 
}
class Child1 extends Parent1{
	 void disp() {       //also a static method hides method
		System.out.println("this is child");
	}
}
