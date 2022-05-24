package AbstractFactory.Brands;
public class GetBrandFactory {

    public Brand getBrand(String brandName) {
        if(brandName == null){
            return null;
        }
        if(brandName.equals("LG")) {
            return new LG();
        }
        else if(brandName.equals("Mitsubishi")){

            return new Mitsubishi();
        }
        else if(brandName.equals("Toyota")) {
            return new Toyota();
        }
        return null;
    }

}
