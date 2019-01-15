package advancedDay2Assignment20;

public class Child1 extends Base{

    public void getValues(){
        System.out.println(getVariable1());
        System.out.println(getVariable2());
        //System.out.println(variable3); // here variable3 cannot be accessed as it is private (needs getter method in Base class)
        System.out.println(variable4);
    }
}
