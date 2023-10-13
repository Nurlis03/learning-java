package packages;
import packages.myPackage.MyClass;

public class PrintName {
    public static void main(String args[]) {
        String name = "GeekforGeeks";

        MyClass obj = new MyClass();

        obj.getNames(name);
    }
}
