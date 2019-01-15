package basicDay2Assignment4_5_6;

public class Student {

	private int studentID;
	private String studentType;

// Default constructors for day 2 assignment 5
	public Student() {
		this.studentID = 10;
		this.studentType = "F";
	}

//Parameterized constructor for day 2 assignment 6
	public Student(int studentID, String studentType) {
		super();
		this.studentID = studentID;
		this.studentType = studentType;
	}

//setter and getter methods for day 2 assignment 4
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}

	public int getStudentID() {
		return studentID;
	}

	public String getStudentType() {
		return studentType;
	}

}
