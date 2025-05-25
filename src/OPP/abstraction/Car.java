package OPP.abstraction;

public class Car extends Vehicle{

    public Car(String brand, String model){
        super(brand, model);
    }

    @Override
    public void start(){
        System.out.println(getBrand() + "-" + getModel() + " car is starting with a key");
    }

    @Override
     public void stop(){
        System.out.println(getBrand() + " car is stop with break");
    }


}
