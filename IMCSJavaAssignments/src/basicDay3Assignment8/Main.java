package basicDay3Assignment8;


public class Main {
	public static void main(String args[]) {
		Student student1 = new Student(12,"F", "Aditya", "Namburi", "Day Scholar",0.0);
		Student student2 = new Student(13,"S", "Akash", "Arora", "Hostelite",0.0, 0.0);
		
		if(student1.getResidentialStatus() == "Day Scholar") {
			student1.calculateFees(80000.0);	
		}
		
		if(student1.getResidentialStatus() == "Hostelite") {
			student1.calculateFees(80000.0, 500.0);	
		}
		if(student2.getResidentialStatus() == "Day Scholar") {
			student2.calculateFees(80000.0);	
		}
		if(student2.getResidentialStatus() == "Hostelite") {
			student2.calculateFees(80000.0, 500.0);	
		}

		
	}
}
