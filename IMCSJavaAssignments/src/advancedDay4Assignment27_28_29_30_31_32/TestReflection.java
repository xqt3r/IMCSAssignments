package advancedDay4Assignment27_28_29_30_31_32;

import java.lang.reflect.*;

import static java.lang.System.out;

public class TestReflection {

    private static final String fmt = "%24s: %s%n";

    // for the morbidly curious
    <E extends RuntimeException> void genericThrow() throws E {
    }

    public static void printClassConstructors(Class c) {
        Constructor[] allConstructors = c.getConstructors();
        out.format(fmt, "Number of constructors", allConstructors.length);
        for (Constructor currentConstructor : allConstructors) {
            printConstructor(currentConstructor);
        }
        Constructor[] allDeclConst = c.getDeclaredConstructors();
        out.format(fmt, "Number of declared constructors",
                allDeclConst.length);
        for (Constructor currentDeclConst : allDeclConst) {
            printConstructor(currentDeclConst);
        }
    }

    public static void printClassMethods(Class c) {
        Method[] allMethods = c.getDeclaredMethods();
        out.format(fmt, "Number of methods", allMethods.length);
        for (Method m : allMethods) {
            printMethod(m);
        }
    }

    public static void printConstructor(Constructor c) {
        out.format("%s%n", c.toGenericString());
        Parameter[] params = c.getParameters();
        out.format(fmt, "Number of parameters", params.length);
        for (int i = 0; i < params.length; i++) {
            printParameter(params[i]);
        }
    }

    public static void printMethod(Method m) {
        out.format("%s%n", m.toGenericString());
        out.format(fmt, "Return type", m.getReturnType());
        out.format(fmt, "Generic return type", m.getGenericReturnType());

        Parameter[] params = m.getParameters();
        for (int i = 0; i < params.length; i++) {
            printParameter(params[i]);
        }
    }

    public static void printParameter(Parameter p) {
        out.format(fmt, "Parameter class", p.getType());
        out.format(fmt, "Parameter name", p.getName());
        out.format(fmt, "Modifiers", p.getModifiers());
        out.format(fmt, "Is implicit?", p.isImplicit());
        out.format(fmt, "Is name present?", p.isNamePresent());
        out.format(fmt, "Is synthetic?", p.isSynthetic());
    }

    public static void main(String... args) {

        try {
            printClassConstructors(Class.forName("advancedDay4Assignment27_28_29_30_31_32.Employee"));
            printClassMethods(Class.forName("advancedDay4Assignment27_28_29_30_31_32.Employee"));
        } catch (ClassNotFoundException x) {
            x.printStackTrace();
        }
    }
}

//    public static void main(String args[]) throws Exception{
//        Employee obj = new Employee();
//        Class cls = obj.getClass();
//        Constructor[] cons = cls.getDeclaredConstructors();
//        Method[] methods = cls.getMethods();
//
//        System.out.println("The name of the class is "+ cls.getName());
//        for (Constructor ctr:cons)
//            System.out.println("The constructors of the class are "+ ctr.getName());
//        for (Method method:methods)
//            System.out.println(method.getName());
//
//        try{
//            Class classOBJ = Class.forName("advancedDay4Assignment27_28_29_30_31_32.Employee");
//        }
//        catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//  }
//}

