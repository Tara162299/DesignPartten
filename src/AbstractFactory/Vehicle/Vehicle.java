package AbstractFactory.Vehicle;

import AbstractFactory.Brands.Brand;

public abstract class Vehicle extends Brand {
    private String type;
    private double rate;

    public abstract void getRate();
    public abstract String calculateBill(int hours);
}
