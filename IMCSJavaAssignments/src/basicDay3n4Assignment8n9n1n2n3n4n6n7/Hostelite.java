package basicDay3n4Assignment8n9n1n2n3n4n6n7;

public class Hostelite extends Student {
    private String hostelName;
    private int roomNumber;

    public Hostelite(String courseName, int studentID, String studentType, String studentName, double feesPerMonth, String hostelName, int roomNumber) {
        super(courseName, studentID, studentType, studentName, "Hostelite", feesPerMonth);
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
        displayDetails();
        System.out.println("\n");
    }

    public String getHostelName() {
        return hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(this.hostelName + " "+ this.roomNumber);

    }
}


