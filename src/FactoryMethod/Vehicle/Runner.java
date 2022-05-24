package FactoryMethod.Vehicle;

public class Runner {
    public static void main(String[] args) {
        GetVehicleFactory vehicle1 = new GetVehicleFactory();
        vehicle1.getVehicle("Car").getRate();
    }
}
