package OOPConcepts;

public class CallByValueAndCallByReference {
	
	int p, q;

	public static void main(String[] args) {
		
		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		int x = 10, y = 20;
		obj.testSume(x, y); //call by value
		
		obj.p= 50;
		obj.q = 60;
		obj.swap(obj);
		
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);


	}
	
	public int testSume(int a, int b) {
		int c = a+b;
		return c;
	}
	//call by reference
	public void swap(CallByValueAndCallByReference t) {
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
		
	}

}
