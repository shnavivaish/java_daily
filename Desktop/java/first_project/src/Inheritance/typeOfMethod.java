//using polymorphism method program has all type of method inherited job(), overriden protect() and specialized method which is comment out
package Inheritance;
public class typeOfMethod {

	public static void main(String[] args) {

	//polymorphism using parent refernace variable as well as static method for code reduction
	 duty(new army());
	 duty(new navy());
     duty(new airForce());
	}
	static void duty(securityForce obj) {
		obj.job();
		obj.protect();
	}

}
class securityForce{
    void job(){
        System.out.println("to protect the nation");
    }
    void protect(){
        System.out.println("protect the nation via three forces");
        
    }
    
}
class army extends securityForce{
	void protect() {
		System.out.println("land of india");
		}
//	void useTank() {
//		System.out.println("uses tank to protect the nations");
//	}
}
class navy extends securityForce{

	void protect() {
		System.out.println("protect the water of india ");
		
	}
//	void useShips() {
//		System.out.println("use big shipes in order to protect nation");
//	}
}
class airForce extends securityForce{
	void protect() {
		System.out.println("protect air if india");
		
	}
//void usejet() {
//	System.out.println("uses jet");
//}
}