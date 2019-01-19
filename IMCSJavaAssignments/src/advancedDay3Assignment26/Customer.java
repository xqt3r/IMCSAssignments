package advancedDay3Assignment26;

public class Customer {
    private int customerID;
    private String customerName;
    private String customerAddress;
    private int pincode;

    public Customer(int customerID, String customerName, String customerAddress, int pincode) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.pincode = pincode;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public int getPincode() {
        return pincode;
    }
}
