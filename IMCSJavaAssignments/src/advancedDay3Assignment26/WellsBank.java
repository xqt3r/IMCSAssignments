package advancedDay3Assignment26;

public class WellsBank {
    public static void main(String args[]){

        //Assignment 13 and 14
//        Customer customer1 = new Customer(1, "John","213 N San Mateo", 50034);
//        SavingsAccount customer1SA = new SavingsAccount(1,customer1,1000.0);
//        customer1SA.deposit(1000.0);
//        System.out.println("Current Balance "+ customer1SA.balanceEnquiry());
//
//        Customer customer2 = new Customer(2,"Jenny","234 S McArthur", 4005);
//        CurrentAccount customer2CA = new CurrentAccount(2,customer2,500,2000.0);
//        System.out.println("Current Balance "+ customer2CA.balanceEnquiry());
//        customer2CA.withdraw(1000.0);
//        System.out.println("Current Balance "+ customer2CA.balanceEnquiry());
//        customer2CA.withdraw(4000.0);
//        System.out.println("Current Balance "+ customer2CA.balanceEnquiry());
//        customer2CA.withdraw(3000.0);

        //Assignment 15
//        Customer customer1= new Customer(1,"John","123 N San Mateo", 43534);
//        SavingsAccount customer1SA = new SavingsAccount(1,customer1,1000.0);
//        WellsBank.transaction(customer1SA, 1000.0);
//        customer1SA.withdraw(1000.0);
//        System.out.println("Current Balance "+ customer1SA.balanceEnquiry());
//
//        Customer customer2 = new Customer(2,"Jenny","234 S McArthur", 4005);
//        CurrentAccount customer2CA = new CurrentAccount(2,customer2,500,2000.0);
//        WellsBank.transaction(customer2CA,1500);
//        System.out.println("Current Balance "+ customer2CA.balanceEnquiry());
//        customer2CA.withdraw(1000.0);
//        System.out.println("Current Balance "+ customer2CA.balanceEnquiry());
//        customer2CA.withdraw(4000.0);
//        System.out.println("Current Balance "+ customer2CA.balanceEnquiry());
//        customer2CA.withdraw(3000.0);
//        System.out.println("Current Balance "+ customer2CA.balanceEnquiry());

        //Assignment 17
        Customer customer1= new Customer(1,"John","123 N San Mateo", 43534);
        SavingsAccount customer1SA = new SavingsAccount(1,customer1,1000.0);
        WellsBank.transaction(customer1SA, 1000.0);
        try{
            customer1SA.withdraw(2000.0);
        }
        catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Current Balance "+ customer1SA.balanceEnquiry());

        Customer customer2 = new Customer(3,"Jenny","234 S McArthur", 4005);
        CurrentAccount customer2CA = new CurrentAccount(2,customer2,1000,200.0);
        //WellsBank.transaction(customer2CA,2500);
        try{
            customer2CA.withdraw(1300);
        }
        catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Current Balance "+ customer2CA.balanceEnquiry());


    }
        //Method definition for Assignments 13-16
//    public static void transaction(Account account, double amount){
//        account.deposit(amount);
//
//    }

    //Method definition for Assignments 17

    public static void transaction(Account account, double amount){
        account.deposit(amount);
        try{
            account.withdraw(100);
        }
        catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
