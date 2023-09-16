package finalKeyword;

public class finalKeyword {
    public static void main(String[] args) {
        /*
        Definition and Usage. 
        The final keyword is a non-access modifier used for classes, 
        attributes and methods, which makes them non-changeable 
        (impossible to inherit or override). 
        The final keyword is useful when you want a variable 
        to always store the same value, like PI (3.14159...).
         */
        final double PI = 3.14159;
        
        // PI = 4; // error

        System.out.println(PI);
    }
}
