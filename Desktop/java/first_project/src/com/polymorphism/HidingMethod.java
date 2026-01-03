package com.polymorphism;

public class HidingMethod {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.disp();
		Child c=new Child();
		c.disp();
		Parent ref=new Child();
		ref.disp();            //now even if the obj is of Child still parent method will excute , as method is callled using parent refernace which was declared static

	}

}
class Parent{
	static void disp() {          // static method will not store in object in heap as it take place in static segment 
		System.out.println("this is parent");	}
	 
}
class Child extends Parent{
	static void disp() {       //also a static method hides method
		System.out.println("this is child");
	}
}
