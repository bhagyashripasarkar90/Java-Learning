package NullConcept;

public class NullConcept {
	
	static Object obj;
	static String str;
	static NullConcept nc;

	public static void main(String[] args) {
		//1.
		/*System.out.println(obj);
		System.out.println(str);
		System.out.println(nc);*/
		
		//2
//		Integer i = null;
//		int j = i;

		//3.instanceof 
//		Integer i =null;
//		Integer j = 10;
//		System.out.println(j instanceof Integer);
//		System.out.println(i instanceof Integer);
		
		//4.static vs nonstatic wrt null
//		NullConcept obj = null;
//		obj.send();
//		obj.sum();
		
		//5. == and !=
//		System.out.println(null==null);
//		System.out.println(null!=null);
//		
//		//6. 
//		String str = null;
//		Integer i = null;
//		Double d = null;
		
		String s1 = (String)null;
		System.out.println(s1 +"123");
		System.out.println(s1.length());
		
		Integer i1 = (Integer)null;
		Double d1 = (Double)null;
		
	}
	
		
		//4. Static vs NonStatics
//		public static void sum() {
//			System.out.println("Sum...");
//		}
//		public void send() {
//			System.out.println("Send...");
//		}
//		
		
	}

