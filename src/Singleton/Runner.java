package Singleton;

public class Runner {
    public static void main(String[] args) {
        Car car = Car.getInstance();
        car.printMessage();
    }
}
