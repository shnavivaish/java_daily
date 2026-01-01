//abstarction in polymorphism using parent class refernace variable
package com.polymorphism;
//import Inheritance.trainer;

public class problem2 {

	public static void main(String[] args) {
        duty(new javatrainer());
        System.out.println();
        duty(new apiTrainer());
        System.out.println();
        duty(new testing());

	}
	static void duty(trainer t) {
		t.teach();
	}

}
abstract class trainer{
	abstract void teach();
}
class javatrainer extends trainer{
	void teach() {
		System.out.println("teches java");
	}
	
}
class apiTrainer extends trainer{
	void teach() {
		System.out.println("teches about api");
		
	}

}
class testing extends trainer{
	void teach() {
		System.out.println("provide training about testing");
	}
}