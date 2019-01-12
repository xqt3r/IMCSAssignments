package basicDay3Assignment8;

public class Student {
	private int studentID;
    private String studentType;
    private String studentName;
    private String residentialStatus;
    private double feesPerMonth;
    private double hostelFees;
    
    public Student(int studentID, String studentType, String fNAme, String lName, String residentialStatus, double feesPerMonth){
    	this.studentID = studentID;
        this.studentType = studentType;
        this.studentName = fNAme + " " + lName;
        this.residentialStatus = residentialStatus;
        this.feesPerMonth = feesPerMonth;
    }
    
    public Student(int studentID, String studentType, String fNAme, String lName, String residentialStatus, double feesPerMonth, double hostelFees){
    	this.studentID = studentID;
        this.studentType = studentType;
        this.studentName = fNAme + " " + lName;
        this.residentialStatus = residentialStatus;
        this.feesPerMonth = feesPerMonth;
        this.hostelFees = hostelFees;
    }


    public void displayDetails( Student std){
        System.out.println(std.getStudentName()+ " " + std.getStudentType()+ " " + std.getStudentID()+ " " + std.getResidentialStatus()+ " " + std.getFeesPerMonth());
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
