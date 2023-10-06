package abstraction.secondVersion;

// abstract class
abstract class Car {
    abstract void accelerate(); // ускорять
}

// concrete class
class Suzuki extends Car {
    void accelerate() {
        System.out.println("Suzuki::accelerate");
    }
}

public class Main {
    public static void main(String args[]) {
        Car obj = new Suzuki();     // Car object => contents of Suzuki
        obj.accelerate();           // call the method
    }
}
