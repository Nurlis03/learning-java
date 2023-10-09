package abstraction.secondVersion;

abstract class Vehicle {
    abstract void start();
    abstract void stop();
    abstract void accelerate();
    abstract void brake();
}

class Car extends Vehicle {
    void start() { }
    void stop() { }
    void accelerate() { }
    void brake() { }
}

class Bike extends Vehicle {
    void start () {}
    void stop () {}
    void accelerate () {}
    void brake () {}
}

class Scooter extends Vehicle {
    void start () {}
    void stop () {}
    void accelerate () {}
    void brake () {}
}

public class Main2 {
    
}
