public class memoryManagement {
    public static void main(String[] args) {
        String localPrefix = new Integer(297).toString().intern(); //1
        String prefix = "297";      //2

        if (prefix == localPrefix)
        {
            System.out.println("Strings are equal" );
        }
        else
        {
            System.out.println("Strings are different");
        }
    }
}