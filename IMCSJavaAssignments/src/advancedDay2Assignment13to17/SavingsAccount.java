package advancedDay2Assignment13to17;

public class SavingsAccount extends Account {
    private double minimumBalance;
    private int interestRate;

    public SavingsAccount(int accountNo, Customer customer, double balance) {
        super(accountNo, customer, balance);
        this.minimumBalance = 500.0;
        this.interestRate = 12;
    }

    public void withdraw(double amount){
        if (super.balance - amount >= minimumBalance){
            super.balance = super.balance-amount;
        }
        else{
            System.out.println("Minimum Balance will not be maintained after withdrawal");
            System.out.println("Withdraw Unsuccessful");
        }
    }

    public void calculateInterest(){
        double interestAmount = super.balance *(interestRate/100.0);
        System.out.println("The interest for your balance "+ super.balance +"is "+ interestAmount);
    }


}
