package OPP.abstraction;

public class Bike extends Vehicle{

    public Bike(String brand, String model){
        super(brand, model);
    }

    @Override
    public void start() {
        System.out.println(getBrand() + "-" +  getModel() + " bike start with a button");
    }

    public void stop(){
        System.out.println(getBrand() + " bike stop with break");
    }
}
