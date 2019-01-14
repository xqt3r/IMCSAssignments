package basicDay4Assignment8;

public abstract class Student {
    protected int studentID;
    protected char studentType;
    protected String studentName;
    protected double feesPerMonth;
    protected int semesterFees;

    public Student(int studentID, char studentType, String studentName, double feesPerMonth, int semesterFees) {
        this.studentID = studentID;
        this.studentType = studentType;
        this.studentName = studentName;
        this.feesPerMonth = feesPerMonth;
        this.semesterFees = semesterFees;
    }

    public void displayDetails(){
        System.out.println(this.studentName);
    }

    public void calculateFees(){
      feesPerMonth = (semesterFees/6.0);
    }

    public abstract void calculateFees(double semesterFees);
}
