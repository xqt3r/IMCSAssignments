package advancedDay1Assignment5n6;

public class Salary extends details {
	private String multiCityChequeBook = "No";
	private String discountDebitCard = "No";
	private String atmCard = "Yes";

	public Salary(String fName, String mNAme, String lNAme, String emailID, String dob, String gender,
			String marritalStatus) {
		super(fName, mNAme, lNAme, emailID, "salary", dob, gender, marritalStatus);
	}
}
