package advancedDay3Assignment25;

public class CheckedExceptionDemo {
    public static void main(String args[]){
        try{
            Class.forName("advancedDay3Assignment25.ExceptionDemo");
        }
        catch (ClassNotFoundException e){
            System.out.println("Exception " + e);
        }
    }
}
