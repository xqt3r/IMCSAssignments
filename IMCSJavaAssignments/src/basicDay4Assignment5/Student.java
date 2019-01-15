package basicDay4Assignment5;

public class Student {
    private static int counter= 0;
    protected int studentID ;
    protected char studentType;
    protected String studentNAme;

    public Student(int studentID, char studentType, String studentNAme) {
        this();
        this.studentType = studentType;
        this.studentNAme = studentNAme;
    }

    public Student() {
        this.studentID = counter;
        counter++;
    }
}
