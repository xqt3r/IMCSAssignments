package basicDay4Assignment5;

public class PostGraduate extends Student {
    protected int pCourseID;
    protected String pCourseName;
    protected int pCourseFees;

    public PostGraduate(int studentID, char studentType, String studentNAme, int pCourseID, String pCourseName, int pCourseFees) {
        super(studentID, studentType, studentNAme);
        this.pCourseID = pCourseID;
        this.pCourseName = pCourseName;
        this.pCourseFees = pCourseFees;
        System.out.println(studentID +" "+ studentType +" "+ studentNAme+ " "+ pCourseID + " "+ pCourseName+ " "+ pCourseFees);
    }
}
