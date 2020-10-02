package OOPConcepts;

public class LocalVsGlobalVariables {
	//Global Variables or class variable as immediately after class i created them
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {
		int i = 10; //local variable of main method
		System.out.println(i);
		LocalVsGlobalVariables l = new LocalVsGlobalVariables();
		System.out.println(l.name);
		System.out.println(l.age);
		int s = l.sum();
		System.out.println(s);
		
		

	}
	public int sum() {
		System.out.println("Sum method");
		int i = 10;// local variable to sum method
		int j = 20;
		int k = i+j;
		return k;		
		
		
	}

}
