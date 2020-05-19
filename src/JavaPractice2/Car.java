package JavaPractice2;

public class Car {
    String car1 = "BMW";
    String car2 = "Audi";
    String car3 = "Toyota";

    public void start(){
        System.out.println("Start my " + car1);
    }
    public void stop(){
        System.out.println("Stop my " + car2);
    }
    public void park(){
        System.out.println("Park my " + car3);
    }

    public static void main(String[] args) {
        // create an object to access the method
        Car myBMW = new Car();
        myBMW.start();
        Car myAudi = new Car();
        myAudi.stop();
        Car myToyota = new Car();
        myToyota.park();

    }




}
