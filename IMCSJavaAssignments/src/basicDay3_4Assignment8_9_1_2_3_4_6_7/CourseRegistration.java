package basicDay3_4Assignment8_9_1_2_3_4_6_7;

public class CourseRegistration {
    protected static int regID;
    protected String courseName;


    public CourseRegistration(String courseName) {
        this.courseName = courseName;
        displayDetails();

    }
    public void displayDetails(){
        System.out.println("Course Name = "+ this.courseName);
    }
}
