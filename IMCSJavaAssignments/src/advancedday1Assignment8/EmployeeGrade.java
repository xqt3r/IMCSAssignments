package advancedday1Assignment8;

public class EmployeeGrade {
	private int employeeNo;
	private String employeeName;
	private double customer1Feedback;
	private double customer2Feedback;
	private double customer3Feedback;
	private double averageFeedback;
	private char grade;

	public EmployeeGrade(int employeeNo, String employeeName, double customer1Feedback, double customer2Feedback,
			double customer3Feedback) {
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.customer1Feedback = customer1Feedback;
		this.customer2Feedback = customer2Feedback;
		this.customer3Feedback = customer3Feedback;
	}
	
	//assignment 9
	public EmployeeGrade(int employeeNo, String employeeName, double customer1Feedback, double customer2Feedback) {
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.customer1Feedback = customer1Feedback;
		this.customer2Feedback = customer2Feedback;
	}
	
	//assignment 10
	public EmployeeGrade() {
        this.employeeNo = 101;
        this.employeeName = "Ram";
        this.customer1Feedback = 4.1f;
        this.customer2Feedback = 4.0f;
        this.customer3Feedback = 4.3f;
    }	

	public double calculateAverageFeedback() {
		this.averageFeedback = (this.customer1Feedback + this.customer2Feedback + this.customer3Feedback) / 3.0;
		System.out.println(this.employeeName + " has got an average feedback score of " + this.averageFeedback);
		return this.averageFeedback;
	}

	public void grade() {
		double grade = calculateAverageFeedback();
		if (grade > 2)
			System.out.println(this.employeeName + " has got a grade of A.");
		else
			System.out.println(this.employeeName + " has got a grade of B.");
	}

	public void displyInfo() {
		double grade = calculateAverageFeedback();
		System.out.println(this.employeeNo + " " + this.employeeName + "has an average feedback of " + grade);
	}

	public static void main(String args[]) {
		EmployeeGrade employee1 = new EmployeeGrade(123, "Aditya", 2.0, 3.0, 2.3);
		employee1.calculateAverageFeedback();
		employee1.grade();
		
		EmployeeGrade employee2 = new EmployeeGrade(123, "Ravi", 2.0, 5.0);
		employee2.calculateAverageFeedback();
		employee2.grade();
		
		EmployeeGrade ram = new EmployeeGrade();
		ram.calculateAverageFeedback();
		ram.grade();
	}
}
