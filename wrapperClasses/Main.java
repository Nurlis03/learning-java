package wrapperClasses;

public class Main {
    public static void main(String[] args) {
        // wrapper class = provides a way use primitive data types as reference data types
        //                 reference data types contain useful methods
        //                 can by used with collections (ex.ArrayList)

        // primitive    wrapper
        // --------     ---------
        // boolean      Boolean
        // char         Character
        // int          Integer
        // double       Double

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding objects wrapper classes
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

        // this is autoboxing feature
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";

        // this is unboxing feature
        if (a == true) {
            System.out.println("This is true");
        }
    }
}
