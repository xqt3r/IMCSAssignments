package basicDay3_4Assignment8_9_1_2_3_4_6_7;

public class DayScholar extends Student {
    private String address;
    final private int semesterfees = 120000;

    public DayScholar(String courseName, int studentID, String studentType, String studentName, double feesPerMonth, String address) {
        super(courseName, studentID, studentType, studentName, "DayScholar", feesPerMonth);
        this.address = address;
        this.displayDetails();
        System.out.println("\n");
    }

    //    public DayScholar(int studentID, String studentType, String fNAme, String lName, String residentialStatus, double feesPerMonth, String address) {
//        super(studentID, studentType, fNAme, lName, residentialStatus, feesPerMonth);
//        this.address = address;
//        displayDetails();
//    }


    public String getAddress() {
        return address;
    }

    //@Override
    public void displayDetails() {
        //super.displayDetails();
        System.out.println(this.address);
    }

    public void calculateFees(){
        feesPerMonth = semesterfees/6;
    }
}


