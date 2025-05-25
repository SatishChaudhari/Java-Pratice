package OPP.abstraction;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car("Toyota", "Rav4");
        Vehicle bike = new Bike("Yamaha", "Aero-155");

        car.start();
        car.stop();
        bike.start();
        bike.stop();

    }
}
