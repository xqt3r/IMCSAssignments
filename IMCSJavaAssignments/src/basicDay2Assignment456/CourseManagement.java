package basicDay2Assignment456;

public class CourseManagement {
	public static void main(String args[]) {
		Student student1 = new Student();
		student1.setStudentID(23);
		student1.setStudentType("Day Scholar");
		System.out.println(student1.getStudentID() + "\t" + student1.getStudentType());
	}
}

