package OOPConcepts;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		//Data Conversion from String to integer
		int i = Integer.parseInt(x);
		System.out.println(i+20);

		//String to Double conversion
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d);
		
		//String to boolean conversion
		String k = "true";
		System.out.println(k);
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		//integer to string conversion
		int j = 200;
		System.out.println(j+20);
		String j1 = String.valueOf(j);
		System.out.println(j1+20);
	}

}
