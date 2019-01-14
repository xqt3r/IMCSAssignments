package advancedDay2Assignment13to17;

public class CurrentAccount extends Account {
    private double eligibityAmount;

    public CurrentAccount(int accountNo, Customer customer, double balance, double eligibilityAmount) {
        super(accountNo, customer, balance);
        this.eligibityAmount = eligibilityAmount;
    }

    public void withdraw(double amount){
        double totalBalance = super.balance + eligibityAmount;
        if (amount <= totalBalance){
            super.balance = super.balance-amount;
        }
        else
            System.out.println("THe amount you want to Withdraw exceeds you eligibility limit");
    }

    public double getEligibilityAmount() {
        return eligibityAmount;
    }
}
