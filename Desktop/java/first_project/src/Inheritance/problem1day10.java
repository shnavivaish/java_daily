//0
package Inheritance;
public class problem1day10 {

	public static void main(String[] args) {
		student1 obj=new student1();
		book obj3=new book(200);
		bike1 obj4=new bike1(88,"kawasaki");
		obj.hasAbike1(obj4);
		obj.hasAbook(obj3);
		System.out.println(obj.obj1.getfun());
		System.out.println(obj.obj2.getjob());
		System.out.println(obj.obj2.gettype());

	}

}
class heart1{
	String fun;
	public heart1(String fun) {
		this.fun=fun;
	}
	public String getfun() {
		return fun;
	}
}
class brain{
	String job;
	String type;
	public brain(String job, String type) {
		this.job=job;
		this.type=type;
	}
	public String getjob() {
		return job;
	}
	public String gettype() {
		return type;
	}
}

class book{
int pages;
public book(int pages) {
	this.pages=pages;
}
public int getpages() {
	return pages;
}
}
class bike1{
	int power;
	String brand;
	public bike1(int power,String brand) {
		this.power=power;
		this.brand=brand;
	}
	public int getpower() {
		return power;
	}
	public String getbrand() {
		return brand;
	}
}
class student1{
	heart1 obj1=new heart1("to pump blood");
	brain obj2=new brain("think","leftbrain");
	void hasAbook(book obj3){
		System.out.println(obj3.getpages());
	}
	void hasAbike1(bike1 obj4) {
		System.out.println(obj4.getpower());
		System.out.println(obj4.getbrand());
	}
}