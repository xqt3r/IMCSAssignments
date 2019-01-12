package basicDay3n4Assignment8n9n1n2n3n4;

public class DayScholar extends Student {
    private String address;

    public DayScholar(String courseName, int studentID, String studentType, String studentName, double feesPerMonth, String address) {
        super(courseName, studentID, studentType, studentName, "DayScholar", feesPerMonth);
        this.address = address;
        displayDetails();
    }

    //    public DayScholar(int studentID, String studentType, String fNAme, String lName, String residentialStatus, double feesPerMonth, String address) {
//        super(studentID, studentType, fNAme, lName, residentialStatus, feesPerMonth);
//        this.address = address;
//        displayDetails();
//    }


    public String getAddress() {
        return address;
    }

    public void displayDetails(){
        System.out.println(this.address);
    }
}
