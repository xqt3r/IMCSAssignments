package advancedDay2Assignment8;

public class TestLoan {
    public static void main(String args[]){
        Loan.getInstance();
        System.out.println("total number of loans " + Loan.getLoanCounter());
    }
}
