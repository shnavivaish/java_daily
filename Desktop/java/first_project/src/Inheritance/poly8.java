package Inheritance;

public class poly8 {

	public static void main(String[] args) {
		trainer obj;    // parent referanace variable can access child class through its refrance variable its called loose coupling
		obj=new javatrainer();
		 obj.teach();
		 obj =new apiTrainer();
		 obj.teach();
         obj =new testing();
        obj.teach();
        obj=new trainer();
        obj.teach();
	}
	

}
class trainer{
	void teach() {
		System.out.println("trainer teaches");
	}
}
class javatrainer extends trainer{
	void teach() {
		System.out.println("teches java");
	}
	
}
class apiTrainer extends trainer{
	void teach() {
		System.out.println("teches about api");
		
	}

}
class testing extends trainer{
	void teach() {
		System.out.println("provide training about testing");
	}
}