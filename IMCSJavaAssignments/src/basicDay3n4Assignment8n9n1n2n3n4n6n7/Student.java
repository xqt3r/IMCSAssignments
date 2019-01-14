package basicDay3n4Assignment8n9n1n2n3n4n6n7;

public abstract class Student extends CourseRegistration {
    protected int studentID;
    protected String studentType;
    protected String studentName;
    protected String residentialStatus;
    protected double feesPerMonth;


    public Student(String courseName, int studentID, String studentType, String studentName, String residentialStatus, double feesPerMonth) {
        super(courseName);
        this.studentID = studentID;
        this.studentType = studentType;
        this.studentName = studentName;
        this.residentialStatus = residentialStatus;
        this.feesPerMonth = feesPerMonth;

    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentType() {
        return studentType;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getResidentialStatus() {
        return residentialStatus;
    }

    public double getFeesPerMonth() {
        return feesPerMonth;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(this.studentID + " " + this.studentName + " " + this.residentialStatus);

    }
}







