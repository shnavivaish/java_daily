//how constructer behaves in case of inheritance
package Inheritance;

public class Inheri {

	public static void main(String[] args) {
		chd obj=new chd(100,99);
		System.out.println(obj.a+" " +obj.b);

	}

}
class par{
int a;
int b;
	public par() {
		this(99,99); //2. now it will go to parameterize constructer of parent class
		//4. it will go to child class from where it is called parameterize wala constructer
		a=10;
		b=20;
		System.out.println("p");
	}
	public par(int a, int b) {// 3.frist will go to obj as default super method , then it will excute code
		this.a=a ;
		this.b=b;
		System.out.println("q");
	}
}

class chd extends par{
	public chd() { // super hai isliye parent constructer pr jayenga zo parametrize nhi hai
		a=30;
		b=40;
		System.out.println("r");
	}
	public chd(int a, int b) {
		this(); //1.current class ke constructor ko call krenga zero parameterize wale as it too don't have parameter
		this.a=a ; //5.
		this.b=b;
		System.out.println("s");
	}
	
}