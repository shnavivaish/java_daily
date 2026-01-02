package Inheritance;

public class day9 {

	public static void main(String[] args) {
		tendulakar obj=new arjun();  // created parent type referance
		obj.job();
		obj.profession();
//		obj.smoke();  as it is specialized method and with parent type refernace we can not access specialized method
		((arjun)obj).smoke();  //down casting(explicit type casting) but it is tight coupling
	}

}
class tendulakar{
	void job() {
		System.out.println("to play cricket");
	}
	void profession() {
		System.out.println("batsman");
	}
}
class arjun extends tendulakar{
	void job() {             //inherted method same name same content in both child and parent 
		System.out.println("to play cricket");
	}
	void profession() {   //override method as content change but name of method is same
		System.out.println("bowler");
	}
	void smoke() {   //specialized method
			System.out.println("he smokes ciggrate sometimes");
		
	}
}