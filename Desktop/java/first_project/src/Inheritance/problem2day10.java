package Inheritance;

public class problem2day10 {

	public static void main(String[] args) {
//		human obj=new human();
		students c=new students();
		
	    System.out.println(c.obj1.getfun());
	    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	    System.out.println(c.obj2.gettype());
	    System.out.println(c.obj2.getjob());
	    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	   bookk a=new bookk(400);
		c.hasAbookk(a);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		bikee b=new bikee(4500,"pulser");
	    c.hasAbikee(b);

	}

}
class human{
	heartt obj1=new heartt("to pump blood");
	brainn obj2=new brainn("think","leftbrain");
}
class students extends human{
	void hasAbookk(bookk a) {
		System.out.println(a.getpages());
	}
	void hasAbikee(bikee b) {
		System.out.println(b.getpower());
		System.out.println(b.getbrand());
	}
}
class heartt{
	String fun;
	public heartt(String fun) {
		this.fun=fun;
	}
	public String getfun() {
		return fun;
	}
}
class brainn{
	String job;
	String type;
	public brainn(String job, String type) {
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
class bookk{
int pages;
public bookk(int pages) {
	this.pages=pages;
}
public int getpages() {
	return pages;
}
}
class bikee{
	int power;
	String brand;
	public bikee(int power,String brand) {
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