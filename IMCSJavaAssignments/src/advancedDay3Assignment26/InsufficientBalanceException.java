package advancedDay3Assignment26;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(){
        super("Sufficient Balance not available.");
    }
}
