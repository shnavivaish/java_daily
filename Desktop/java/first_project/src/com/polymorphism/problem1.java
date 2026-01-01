//abstarction in polymorphism
package com.polymorphism;
public class problem1 {

	public static void main(String[] args) {
		duty(new army());
        System.out.println();
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println();
        duty(new navy());
        
	}
	static void duty(Security sf) {
		sf.protect1();
	}

}
abstract class Security{
	abstract void protect1();
}
class army extends Security{
	void protect1() {
		System.out.println("protect the land");
		}
//	void useTank() {    its specialized method
//		 System.out.println("army uses tank");
//	}
}
class navy extends Security{
	void protect1(){
		System.out.println("protect the water");
	}

	
}