package JavaBasics;

public class ArrayConcepts {

	//One diamensional array
	//Disadvantages of array: 
	public static void main(String[] args) {
		int i[] =  new int [4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[0]);
		//System.out.println(i[4]);
		System.out.println(i.length);
		
		//print length of array
		for(int j=0;j<i.length;j++)
		{
			System.out.println("All the values of Array's are:" +i[j]);
		}
		
		char c[] =  new char[3];
		c[0] = 'c';
		c[1] = 'b';
		c[2] = 'f';
		
		boolean b[]= new boolean[3];
		b[0] = true;
		b[1] = false;
		
		
		String s[] = new String [2];
		s[0] = "Radha_";
		s[1] = "Krishna";
		System.out.println(s.length);
		
		Object ob[] = new Object[5];
		ob[0] = "Tom";
		ob[1] = 12;
		ob[3] = 'M';
		ob[4] = "London";
		
		//System.out.println(ob[4]);
		for (int j=0; j<ob.length; j++)
		{
			System.out.println(i[j]);
		}
		

	}

}
