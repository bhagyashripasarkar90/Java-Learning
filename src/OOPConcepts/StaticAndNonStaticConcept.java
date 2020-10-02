package OOPConcepts;

public class StaticAndNonStaticConcept {
	String name = "Tom"; //Non static global variable
	static int age = 25; //static global variable
	public static void main(String[] args) {
		//1. Direct calling
		sum();
		System.out.println(age);
		//2. Calling by class name
		System.out.println(StaticAndNonStaticConcept.age);
		StaticAndNonStaticConcept.sum();
		
		StaticAndNonStaticConcept s = new StaticAndNonStaticConcept();
		System.out.println(s.name); 
		s.sendmail();
		

	}
	
	public void sendmail() {
		System.out.println("Sendmail Method");
	}
	
	public static void sum() {
		System.out.println("Sum Method");
	}

}
