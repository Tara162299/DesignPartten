package FactoryMethod.Vehicle;

abstract class Vehicle {
    private String type;
    private double rate;

    public abstract void getRate();
    public abstract String calculateBill(int hours);
}
