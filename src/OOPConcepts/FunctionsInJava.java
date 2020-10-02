package OOPConcepts;

public class FunctionsInJava {

	public static void main(String[] args) {
		FunctionsInJava f = new FunctionsInJava();
		//one object will be created and f is the reference variable and obj is reference variable
		//after creating the object the copy of all "non static" method will be given to this object
		f.test();
		int sum	= f.PQR();
		System.out.println(sum);
		
		int div = f.division(30, 10);		
		System.out.println(div);
	}
	
	public void test() { //no input no output
		System.out.println("Test method");
	}
	
	public int PQR() { // no input but some output
		System.out.println("PQR Method");
		int a = 10, b = 20, c = a+b;
		return c;
	}
	
	public int division(int x, int y) {
		System.out.println("Division Method");
		int d = x/y;
		return d;		
	}
	
	
	

}
