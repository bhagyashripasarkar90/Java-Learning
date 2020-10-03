package FinalFinallyFinalize;

public class Finally {

	public static void main(String[] args) {
		divison();
		
	}
		public static void divison() {		
		int i = 10;
		try {
			System.out.println("Inside Try block");
			int k = i / 0;
		} catch (NullPointerException e) {
			System.out.println("Inside Catch block");
			System.out.println("Divide by Zero");
		} finally {
			System.out.println("Executed even after exception is comes");
		}

	}
}

