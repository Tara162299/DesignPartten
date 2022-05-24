package FactoryMethod;
public class GetVehicleFactory {
    public Vehicle getVehicle(String type) {
        Vehicle vehicle;
        switch (type) {
            case "Car" -> {
                vehicle = new Car();
                return vehicle;
            }
            case "Plane" -> {
                vehicle = new Plane();
                return vehicle;
            }
            case "Bike" -> {
                vehicle = new Bike();
                return vehicle;
            }
            default -> {
                return null;
            }
        }
    }
}
