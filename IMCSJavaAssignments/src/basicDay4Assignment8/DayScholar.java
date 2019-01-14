package basicDay4Assignment8;

public class DayScholar extends Student{
    private String address;

    public DayScholar(int studentID, char studentType, String studentName, int feesPerMonth, int semesterFees, String address) {
        super(studentID, studentType, studentName, feesPerMonth, semesterFees);
        this.address = address;
    }

    public void displayDaySDetails(){
        System.out.println(this.address);
    }

    @Override
    public void calculateFees(double semesterFees) {
        super.feesPerMonth = super.semesterFees/6;
        System.out.println("dbfhjjhf");
    }

    public String getAddress() {
        return address;
    }
}
