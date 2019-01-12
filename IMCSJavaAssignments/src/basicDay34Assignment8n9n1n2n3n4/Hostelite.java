package basicDay34Assignment8n9n1n2n3n4;

public class Hostelite extends Student {
    private String hostelName;
    private int roomNumber;

    public Hostelite(String courseName, int studentID, String studentType, String fName,String lName, String residentialStatus, double feesPerMonth,  String hostelName, int roomNumber) {
        super(courseName, studentID, studentType, fName+lName, residentialStatus, feesPerMonth);
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
        displayDetails();
    }

//        public Hostelite(int studentID, String studentType, String fNAme, String lName, String residentialStatus, double feesPerMonth, String hostelName, int roomNumber) {
//        super(studentID, studentType, fNAme, lName, residentialStatus, feesPerMonth);
//        this.hostelName = hostelName;
//        this.roomNumber = roomNumber;
//        displayDetails();
//    }

    public String getHostelName() {
        return hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void displayDetails() {
        System.out.println(this.studentID+ " "+ this.studentType+ " "+ this.studentName + " " + this.residentialStatus + " "+ this.hostelName + " " + this.roomNumber );
    }
}
