package Singleton;

public class Car {
    private static Car car = new Car();

    private Car() {
    }

    public static Car getInstance() {
        return car;
    }

    public void printMessage() {
        System.out.println("This is a message");
    }
}
