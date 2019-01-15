package advancedDay1Assignment5_6;

public class NonSalary extends details{
    private String multiCityChequeBook = "No";
    private String discountDebitCard = "Yes";
    private String atmCard = "Yes";
    private int balance = 10000;

    public NonSalary(String fName, String mNAme, String lNAme, String emailID, String dob, String gender, String marritalStatus) {
        super(fName, mNAme, lNAme, emailID, "Non Salary", dob, gender, marritalStatus);
    }
}
