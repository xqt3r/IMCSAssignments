package basicDay3n4Assignment8n9n1n2n3n4n6n7;

public class CourseRegistration {
    protected static int regID;
    protected String courseName;

    public CourseRegistration(String courseName) {
        this.courseName = courseName;

    }
    public void displayDetails(){
        System.out.println("Course Name = "+ this.courseName);
    }
}
