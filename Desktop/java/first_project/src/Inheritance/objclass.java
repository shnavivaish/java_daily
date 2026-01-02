//multilevel inheritance
package Inheritance;
public class objclass {

	public static void main(String[] args) {
		childs obj =new childs();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.disp();

	}

}
class grandparent{
	int a=10;
}
class parents extends grandparent{
	int b=20;
}
class childs extends parents{
	void disp() {
		System.out.println(a+b);
	}
	
}