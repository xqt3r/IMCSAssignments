package advancedDay4Assignment27_28_29_30_31_32;

import java.util.*;

public class Employee {
    private int employeeID;
    private String employeeName;
    private String dob;


    public Employee(){

    }

    public Employee(int employeeID, String employeeName, String dob) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.dob = dob;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDob() {
        return dob;
    }

    public String print(){
         return this.getEmployeeID() + " " + this.getEmployeeName() + " "+ this.getDob();
    }
    public static void main(String args[]){
        //Assignment 27,28.29
//        Employee john = new Employee(13,"Varma","2-23-1995");
//        john.setEmployeeID(12);
//        john.setEmployeeName("JOHN");
//        john.setDob("2-23-1995");
//
//        System.out.println(john.getEmployeeID() + " "+ john.getEmployeeName()+ " " + john.getDob());


        //Assignment 30
        ArrayList<Employee> array1 = new ArrayList<Employee>(4); //we can add more than 4 if needed
        array1.add(new Employee(12,"Akash","1995"));
        array1.add(new Employee(13,"Tanisha","1995"));
        array1.add(new Employee(14,"Aditya","1995"));
        array1.add(new Employee(15,"Manish","1995"));


        Iterator<Employee> array1Iterator = array1.iterator();
        //int counter = 0;

        while (array1Iterator.hasNext()){
           //System.out.println(array1Iterator.next().getEmployeeID());// + " "+ array1Iterator.next().getEmployeeName()+ " "+ array1Iterator.next().getDob());
            System.out.println(array1Iterator.next().print());
        }

    }
}
