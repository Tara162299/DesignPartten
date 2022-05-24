package AbstractFactory.Brands.Vehicle;

import AbstractFactory.Brands.GetBrandFactory;

public class GetVehicleFactory {
    private final String brandName;

    public GetVehicleFactory(String brandName) {
        this.brandName = brandName;
    }
    public Vehicle getVehicle(String type) {
        Vehicle vehicle;
        switch (type) {
            case "Car" -> {
                vehicle = new Car(brandName);
                return vehicle;
            }
            case "Plane" -> {
                vehicle = new Plane(brandName);
                return vehicle;
            }
            case "Bike" -> {
                vehicle = new Bike(brandName);
                return vehicle;
            }
            default -> {
                return null;
            }
        }
    }
}
