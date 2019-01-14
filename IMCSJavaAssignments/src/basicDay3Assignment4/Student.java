package basicDay3Assignment4;

import java.security.PrivateKey;

public class Student {
    private int studentID;
    private char studentType;
    private String studentName;

    public Student(int studentID, char studentType, String fNAme, String lNAMe) {
        this.studentID = studentID;
        this.studentType = studentType;
        this.studentName = fNAme + lNAMe;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public void setStudentName(String fName,String lName) {
        this.studentName = fName + lName;
    }

    public int getStudentID() {
        return studentID;
    }

    public char getStudentType() {
        return studentType;
    }

    public String getStudentName() {
        return studentName;
    }
}
