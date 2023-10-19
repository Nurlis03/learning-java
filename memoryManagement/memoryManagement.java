public class memoryManagement {
    public static void main(String[] args) {
        String localPrefix = "297"; //1
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