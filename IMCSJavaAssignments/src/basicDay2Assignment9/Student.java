package basicDay2Assignment9;

public class Student {
	private static int ID = 550;
    private int studentID;
    private String studentType;
    private String studentName;

    public Student(String studentType, String fNAme, String lName){
    	this.studentID = ID;
    	ID++;
        this.studentType = studentType;
        this.studentName = fNAme + " " + lName;
    }


    public void displayDetails( Student std){
        System.out.println(std.getStudentName()+ " " + std.getStudentType()+ " " + std.getStudentID());
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
}
