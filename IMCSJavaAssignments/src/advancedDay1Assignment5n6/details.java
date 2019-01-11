package advancedDay1Assignment5n6;

//advanced ass 5 classes
public class details{
  private String fName;
  private String mNAme;
  private String lNAme;
  private String emailID;
  private String accountType;
  private String dob;
  private String gender;
  private String marritalStatus;

  public details(String fName, String mNAme, String lNAme, String emailID, String accountType, String dob, String gender, String marritalStatus) {
      this.fName = fName;
      this.mNAme = mNAme;
      this.lNAme = lNAme;
      this.emailID = emailID;
      this.accountType = accountType;
      this.dob = dob;
      this.gender = gender;
      this.marritalStatus = marritalStatus;
  }

  public static void main(String args[]){
      Salary employee1 = new Salary("Paul","J","Anderson", "paul@wellsfargo.com", "3rd jan 1985","M","Single");
      NonSalary employee2 = new NonSalary("John"," ","Jacob", "john@wellsfargo.com", "6th mar 1985","M","Married");


  }
}


