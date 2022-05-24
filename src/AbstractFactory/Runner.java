package AbstractFactory;
import AbstractFactory.Brands.GetBrandFactory;
import AbstractFactory.Vehicle.GetVehicleFactory;


public class Runner {
    public static void main(String[] args) {
        GetBrandFactory brand1 = new GetBrandFactory();
        System.out.println(brand1.getBrand("LG").getName());

        GetVehicleFactory vehicle1 = new GetVehicleFactory(brand1.getBrand("LG").getName());
        System.out.println(vehicle1.getVehicle("Bike").getName());

        GetBrandFactory brand2 = new GetBrandFactory();
        System.out.println(brand2.getBrand("Toyota").getName());
        GetVehicleFactory vehicle2 = new GetVehicleFactory(brand2.getBrand("Toyota").getName());
        System.out.println(vehicle2.getVehicle("Car").getName());
    }
}
