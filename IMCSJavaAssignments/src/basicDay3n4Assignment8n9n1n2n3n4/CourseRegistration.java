package basicDay3n4Assignment8n9n1n2n3n4;

public class CourseRegistration {
    protected static int regID;
    protected String courseName;

    public CourseRegistration(String courseName) {
        this.courseName = courseName;
        displayDetails();
    }
    public void displayDetails(){
        System.out.println("Course Name = "+ courseName);
    }
}
