package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		
		int a = 30, b = 20;
		if (a>b)
		{
			System.out.println("a is greate");
		}
		else
		{
			System.out.println("b is grate");
		}
		
		int c = 40, d = 40;
		if (c==d)
		{
			System.out.println("c is equal to d");
		}
		else
		{
			System.out.println("not equal");
		}
	
//Comparison operator (<,>,==,<>)
	
	//write a logic to find out the highest number
	int a1 = 400, b1 = 500, c1 = 300;
	
	if (a1>b1 && a1>c1)
	{
		System.out.println("a1 is gretatest");
	}
	else  if (b1>c1)
	{
		System.out.println("b1 is greatest");
	}
	else
	{
		System.out.println("c1 is greate");
	}
}
}
