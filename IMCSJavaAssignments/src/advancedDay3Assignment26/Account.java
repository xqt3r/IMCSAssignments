package advancedDay3Assignment26;

public abstract class Account {
    private int accountNo;
    private Customer customer;
    protected double balance;

    public Account(int accountNo, Customer customer, double balance) {
        this.accountNo = accountNo;
        this.customer = customer;
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double balanceEnquiry(){
        return this.balance;
    }

    public abstract void withdraw(double amount) throws InsufficientBalanceException;

    public void deposit(double amount){
        this.balance = this.balance+amount;
    }
}
