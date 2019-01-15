package advancedDay2Assignment20;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Child2 extends Base {
    public void getValues(){
        Base b = new Base();
        //System.out.println(variable3);//cannot access private data member of Base class.
        //System.out.println(b.variable3); // here variable3 cannot be accessed by Base class object also as it is private, needs getter method)
        System.out.println(variable4);
    }
}
