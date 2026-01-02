//same return type parent ka parent se access kiya 
package Inheritance;
public class parentsss {
  animal disp() {
	  animal a=new animal();
	  a.disp();
	  return a;
  }
}
class childss extends parentsss{
	dog disp() {
		dog b=new dog();
		return b;
	}
}
class animal{
	void disp(){
		System.out.println("");
	}
	
}
class dog extends animal{
	
}
class sameRetrunType{
	public static void main(String[]args) {
		childss obj=new childss();
		obj.disp();
	}
}