package Inheritance;

public class constructorChaining {

	public static void main(String[] args) {
		child1 obj=new child1();

	}

}
class parent1{

	public parent1() {
		super();
		System.out.println("this is parent constructor");
		
	}	
}
class parent2{
	public parent2() {
		super();
		System.out.println("this is second parent class");
	}
	
	
}
class child1 extends parent1 ,parent2{      //multiple inheritance is not possible in the java as it causes dimaond problem like both the parent class will try to extend obj as object is super class of every class in  the program
// syntax error
	public child1() {
		super();
		System.out.println("this is child class");
	}
	
	
}
