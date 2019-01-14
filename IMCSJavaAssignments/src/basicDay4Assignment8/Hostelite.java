package basicDay4Assignment8;

public class Hostelite extends Student {
    private String hostelName;
    private int roomNumber;

    public Hostelite(int studentID, char studentType, String studentName, double feesPerMonth, int semesterFees, String hostelName) {
        super(studentID, studentType, studentName, feesPerMonth, semesterFees);
        this.hostelName = hostelName;
    }
    public void displayDaySDetails(){
        System.out.println(this.hostelName+ " " + this.roomNumber);
    }
    @Override
    public void calculateFees(double semesterFees) {
        super.feesPerMonth = super.semesterFees/6;
        super.feesPerMonth = super.feesPerMonth+ 1200;
    }
}
