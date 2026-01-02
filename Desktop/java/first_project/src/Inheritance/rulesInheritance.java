//rules of inheritance 
//same visibility
package Inheritance;
public class rulesInheritance {

	public static void main(String[] args) {
		son obj=new son();
		obj.disp();
		obj.abc();

	}
}
class papa {
	public void disp() {
		System.out.println("i am papa ");
	}
	void abc() {
		System.out.println("***** ");
	}
	
}
class son extends papa{
	public void disp() { // same ya ek level jyda chahiye parent class ke method access specifiers se  agr parent method public hai to child method default,protect ,private nhi reh skti
		System.out.println("i am son ");
	}
	 protected void abc() {
		 System.out.println("123456");
	}
}
