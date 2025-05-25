package OPP.abstraction;

public abstract class Vehicle {

    private final String brand;
    private final String model;

    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    //Abstract method to be implemented by subclasses
    public abstract void start();

    public abstract void stop();
}
