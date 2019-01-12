package basicDay34Assignment8n9n1n2n3n4;

public class Student extends CourseRegistration {
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
        displayDetails();
    }

//    public Student(int studentID, String studentType, String studentName, String residentialStatus, double feesPerMonth, double hostelFees) {
//        this.studentID = studentID;
//        this.studentType = studentType;
//        this.studentName = studentName;
//        this.residentialStatus = residentialStatus;
//        this.feesPerMonth = feesPerMonth;
//        this.hostelFees = hostelFees;
//    }



//    public Student(int studentID, String studentType, String fNAme, String lName, String residentialStatus, double feesPerMonth){
//    	this.studentID = studentID;
//        this.studentType = studentType;
//        this.studentName = fNAme + " " + lName;
//        this.residentialStatus = residentialStatus;
//        this.feesPerMonth = feesPerMonth;
//        displayDetails();
//    }
//
//    public Student(int studentID, String studentType, String fNAme, String lName, String residentialStatus, double feesPerMonth, double hostelFees){
//    	this.studentID = studentID;
//        this.studentType = studentType;
//        this.studentName = fNAme + " " + lName;
//        this.residentialStatus = residentialStatus;
//        this.feesPerMonth = feesPerMonth;
//        this.hostelFees = hostelFees;
//        displayDetails();
//    }


    public void displayDetails() {
        System.out.println(this.studentID+ " "+ this.studentType+ " "+ this.studentName + " " + this.residentialStatus);
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
	
	public void calculateFees(double semesterFees) {
		this.feesPerMonth = semesterFees / 6.0;
	}
	
	public void calculateFees(double semesterFees, double hostelFees) {
		this.feesPerMonth = semesterFees / 6.0;
		this.feesPerMonth = this.feesPerMonth + hostelFees;
	}
    
}
