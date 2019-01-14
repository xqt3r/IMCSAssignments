package advancedDay2Assignment8;

public class Loan {
    private int loanNo;
    private int accountNo;
    private int customerNo;
    private int loanAmount;
    private int loanDuration;
    private float interest;

    public static Loan getInstance(){
        Loan loan1= new Loan(1,23,1,2345,12,10);
        return loan1;

    }

    public static int getLoanCounter() {
        return loanCounter;
    }

    private static int loanCounter = 0;

    private Loan(int loanNo, int accountNo, int customerNo, int loanAmount, int loanDuration, float interest) {
        loanCounter++;
        this.loanNo = loanNo;
        this.accountNo = accountNo;
        this.customerNo = customerNo;
        this.loanAmount = loanAmount;
        this.loanDuration = loanDuration;
        this.interest = interest;
    }

    public float calculateInstallments(){
        float installment = 0.0f;
        return installment;
    }

    public int getLoanNo() {
        return loanNo;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public int getCustomerNo() {
        return customerNo;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public int getLoanDuration() {
        return loanDuration;
    }

    public float getInterest() {
        return interest;
    }
}
