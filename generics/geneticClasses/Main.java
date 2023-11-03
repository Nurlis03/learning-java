package generics.geneticClasses;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
        MyGenericClass<Double> myDouble = new MyGenericClass<>(3.14);
        MyGenericClass<Character> myCharacter = new MyGenericClass<>('@');
        MyGenericClass<String> myString = new MyGenericClass<>("Hello");

        ArrayList<String> myFriends = new ArrayList<>();
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myCharacter.getValue());
        System.out.println(myString.getValue());
    }
}
