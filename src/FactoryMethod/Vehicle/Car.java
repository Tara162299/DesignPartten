package FactoryMethod.Vehicle;

public class Car extends Vehicle {
    private final String type = "Car";
    private final double rate = 5.0;

    @Override
    public void getRate() {
        System.out.println("The fee for an hour operating a " + type + " is: " + rate);
    }

    @Override
    public String calculateBill(int hours) {
        return "The fee to operate a " + type + " in " + hours + " is: " + hours * rate;
    }
}
