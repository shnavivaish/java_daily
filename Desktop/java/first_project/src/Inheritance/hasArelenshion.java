package Inheritance;

public class hasArelenshion {

	public static void main(String[] args) {
		student obj=new student();
		obj=null;  // to destroyed the obj of student 
		bike obj1=new bike("bullet",150000,"black");
		obj.hasA(obj1);
		System.out.println(obj.obj3.getjob());
		System.out.println(obj.obj3.getweight());
		
	}

}
class bike{   //aggregation
	String brand;
	float price;
	String color;
	public bike(String brand,float price,String color) {
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	public String getbrand() {
		return brand;
	}
	public float getprice() {
		return price;
	}
	public String getcolor() {
		return color;
	}
}
class student{
	heart obj3=new heart("to pump blood",2);
	void hasA(bike obj1) {
		System.out.println(obj1.getbrand());
		System.out.println(obj1.getprice());
		System.out.println(obj1.getcolor());
		
	}
}
class heart{   //composition
	String job;
	float weight;
	public heart(String job,float weight) {
		this.job=job;
		this.weight=weight;
	}
	public String getjob() {
		return job;
	}
	public float getweight() {
		return weight;
	}
	
}