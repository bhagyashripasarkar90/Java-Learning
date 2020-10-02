package OOPConceptsPart2;

public interface USMedicalInterface extends WHO {
	
	int min_fee =  10;
	
	public void physioServices();
	//cannot create object
	//only method prototype without body (abstract method)
	//interface variable are final and static by default
	
	public void onCologyServices();
	
	public void orthopedicServices();
	
	public void radiologyServices();
	
	//from jdk1.8 you can have static method with body
	public static void service911() {
		System.out.println("US 911 Service");
	}
	
	default void internship() {
		System.out.println("US Internship");
	}
	
	
	
	

}
