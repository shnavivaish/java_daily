package Inheritance;

public class problem3 {

	public static void main(String[] args) {
		child22 obj=new child22();
        obj.disp();
	}
	
}
class parent22{
	int x=10;
	void disp() {
		System.out.println(x);
		}
}
class child22 extends parent22{
	int x=20;   //redeclare kr rhe isliye override nhi krenga 
	void disp() {
		System.out.println(super.x);  //parent wala x print honga
		}
}