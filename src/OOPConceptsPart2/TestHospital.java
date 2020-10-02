package OOPConceptsPart2;

public class TestHospital {

	public static void main(String[] args) {
		
		ApolloHospital ap = new ApolloHospital();
		ap.AmbulanceServices();
		ap.EmergencyServices();
		ap.EntServices();
		ap.medicalInsurance();
		ap.neuroServices();
		ap.getPatientHistory();
		ap.internship();
		System.out.println(USMedicalInterface.min_fee);
		//or
		System.out.println(ApolloHospital.min_fee);
		//USMedicalInterface.min_fee = 20; //NO one can change as it is final
		USMedicalInterface.service911();
		
		USMedicalInterface us = new ApolloHospital();
		us.physioServices();
		us.onCologyServices();
		us.orthopedicServices();
		
		UKMedical uk = new ApolloHospital();
		uk.AmbulanceServices();
		uk.EntServices();
	}

}
