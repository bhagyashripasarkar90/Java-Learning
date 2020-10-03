package EncapsulationConcept;

public class EmployeeData {
	// Private Data Variable
	private int ssn, empAge;
	private String empName;

	public static void main(String[] args) {
		EmployeeData emp = new EmployeeData();
		emp.setEmpAge(20);
		emp.setEmpName("Peter");
		emp.setSsn(123456);
		System.out.println("Employee Name is: " + emp.getEmpName());
		System.out.println("Employee SSN is: " + emp.getSsn());
		System.out.println("Employee Age is: " + emp.getEmpAge());
	}

	// getter and setter methods will be public in nature

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
