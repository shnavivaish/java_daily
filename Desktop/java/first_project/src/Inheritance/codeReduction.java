package Inheritance;

public class codeReduction {

	public static void main(String[] args) {
		duty(new javatrainer1());
		duty(new apiTrainer1());
		duty(new testing1());

	}
	static void duty(trainer1 obj) {
		obj.teach();
	}

}
class trainer1{
	void teach() {
		System.out.println("trainer teaches");
	}
}
class javatrainer1 extends trainer1{
	void teach() {
		System.out.println("teches java");
	}
	
}
class apiTrainer1 extends trainer1{
	void teach() {
		System.out.println("teches about api");
		
	}

}
class testing1 extends trainer1{
	void teach() {
		System.out.println("provide training about testing");
	}
}
