package javaproject1;
abstract class car {
    abstract void start();
    abstract void drive();
    abstract void stop();

    void musicSystem() {
        System.out.println("Playing music");
    }
}

public class AbstractionEx extends car {
    void start() {
        System.out.println("Car started using start button");
    }
    void drive() {
        System.out.println("Car is driving");
    }
    void stop() {
        System.out.println("Car has stopped");
    }

    public static void main(String[] args) {
        car myCar = new AbstractionEx();
        myCar.start();
        myCar.drive();
        myCar.musicSystem();
        myCar.stop();
    }
}
