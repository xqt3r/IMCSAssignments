package basicDay34Assignment8n9n1n2n3n4;

public class CourseRegistration {
    protected static int regID;
    protected String courseName;

    public CourseRegistration(){
        regID++;
    }

    public CourseRegistration(String courseName) {
        this.courseName = courseName;
        displayDetails();
        System.out.println("dsfhjdsf");
    }
    public void displayDetails(){
        System.out.println("Registration ID = "+ regID);
        System.out.println("Course Name = "+ this.courseName);
    }
}
