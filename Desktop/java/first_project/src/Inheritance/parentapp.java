package Inheritance;

public class parentapp {

	public static void main(String[] args) {
		child obj=new child();
		System.out.println(obj.a);   // if suppose a was declared private in parent class it could not have been possible to call it and print it
		System.out.println("--------------------------------");
		obj.disp();
		obj.disp1();
		

	}

}
class parent{
	int a=10;
	int b=20;
	void disp() {
		System.out.println(a);
		System.out.println(b);
		
		}
}
class child extends parent{
	void disp1() {
		System.out.println(a+b);
	}
}
