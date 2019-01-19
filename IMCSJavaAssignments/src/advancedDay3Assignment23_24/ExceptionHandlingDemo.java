package advancedDay3Assignment23_24;

public class ExceptionHandlingDemo {

    public static void main(String args[]){
        String name = null;
        int total = 100, count = 0;

        try {
            int average = total/count;
            System.out.println(average);
            System.out.println(name.length());
            System.out.println("End of try block"); // if you want to print this statement put it in finally block.
        }
        catch (NullPointerException e){
            System.out.println("String Object name is null");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception " + e.getMessage());
        }
        finally {
            //System.out.println("End of try block");
            System.out.println("within finally block");
        }
        System.out.println("Continuing the execution... ");
    }
}
