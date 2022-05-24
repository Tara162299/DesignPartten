package FactoryMethod.Vehicle;

public class Bike extends Vehicle {
    private final String type = "Bike";
    private final double rate = 2.0;
    @Override
    public void getRate() {
        System.out.println("The fee for an hour operating a " + type + " is: " + rate);
    }

    @Override
    public String calculateBill(int hours) {
        return "The fee to operate a " + type + " in " + hours + " is: " + hours * rate;
    }
}
