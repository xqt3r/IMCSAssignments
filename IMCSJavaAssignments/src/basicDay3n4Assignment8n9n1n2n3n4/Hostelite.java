package basicDay3n4Assignment8n9n1n2n3n4;

public class Hostelite extends Student {
    private String hostelName;
    private int roomNumber;

    public Hostelite(String courseName, int studentID, String studentType, String studentName, double feesPerMonth, String hostelName, int roomNumber) {
        super(courseName, studentID, studentType, studentName, "Hostelite", feesPerMonth);
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
        displayDetails();
    }

    public String getHostelName() {
        return hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void displayDetails(){
        System.out.println(this.hostelName + " "+ this.roomNumber);
    }
}
