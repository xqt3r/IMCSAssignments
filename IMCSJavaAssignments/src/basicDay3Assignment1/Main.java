package basicDay3Assignment1;

public class Main {
	public static void main(String args[]) {
		Student student1 = new Student("D", "Bony", "Thomas");
		student1.displayDetails(student1);
		Student student2 = new Student("H", "Dinil", "Bose");
		student2.displayDetails(student2);
		
		System.out.println(Student.getStudentCount());
	}
}
