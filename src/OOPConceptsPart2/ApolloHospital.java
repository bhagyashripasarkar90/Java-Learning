package OOPConceptsPart2;

public class ApolloHospital extends GlobalPatientData implements USMedicalInterface, UKMedical, IndianMedicalAssociation{

	@Override
	public void physioServices() {
		System.out.println("Apollo AP -- Physio");
		
	}

	@Override
	public void onCologyServices() {
		System.out.println("Apollo AP -- onCology");
		
	}

	@Override
	public void orthopedicServices() {
		
		System.out.println("Apollo AP -- orthopedic");
	}

	@Override
	public void EntServices() {
		System.out.println("Apollo AP -- EntServices");
		
	}

	@Override
	public void AmbulanceServices() {
		System.out.println("Apollo AP -- AmbulanceServices");
		
	}

	@Override
	public void EmergencyServices() {
		System.out.println("Apollo AP -- EmergencyServices");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("Apollo AP -- neuroServices");
		
	}

	@Override
	public void pediatricServices() {
		System.out.println("Apollo AP -- pediatricServices");
		
	}
	//non overridden method
	public void OPTServices()
	{
		System.out.println("AP--OPTService");
	}
	
	public void medicalInsurance() {
		System.out.println("AP--medicalInsurance");
	}
	
	public void pathalogyServices()
	{
		System.out.println("AP -- Pathalogy");
		
	}

	@Override
	public void radiologyServices() {
		System.out.println("AP -- radiology");
		
	}

	@Override
	public void polio() {
		System.out.println("AP - WHO");
		
	}
	
	


}

