package TestMain;

public class TestBase {

	public static void main(String[] args) {
		System.out.println("Main Method with String[] args");
		main("Testing");
	}
	public static void main(String args) {
		System.out.println("Main Method with String args");
	}
	public static void main(int a) {
		System.out.println("Main Method with int a ");
	}
	public static void main(int a, int b) {
		System.out.println("Main Method with int a, int b ");
	}
}
