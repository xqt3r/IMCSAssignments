package basicDay4Assignment8;

public class Main {

    public static void main(String args[]) {
        Student ref1;
        Student student1 = new DayScholar(23,'F',"Aditya",1400, 300,"8037486 N San Mateo");
        student1.calculateFees(300.0);
        student1.displayDetails();
        ((DayScholar) student1).displayDaySDetails();

    }
}







