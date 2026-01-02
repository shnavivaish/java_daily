package Inheritance;

public class hasArelationship {

	public static void main(String[] args) {
		laptop obj=new laptop();
		charger obj1=new charger("dell",45);
		obj.hasA(obj1);
		System.out.println(obj.obj2.getbrand());
		System.out.println(obj.obj2.getversion());
		}

}
class charger{
	String brand;
	int power;
	public charger( String brand,int power) {
		this.brand=brand;
		this.power=power;
		
		}
	public String getbrand() {
		return brand;
	}
	public int getpower() {
		return power;
	}
}
class laptop{
	os obj2=new os("window",12); //as os depend on laptop
	void hasA(charger c) {
		System.out.println(c.getbrand());
		System.out.println(c.getpower());
		
	}

}
class os{
	String brand;
	int version;
	public os(String brand, int version) {
		this.brand=brand;
		this.version=version;
	}
	public String getbrand() {
		return brand;
}
	
	public int getversion() {
		return version;
	}
}