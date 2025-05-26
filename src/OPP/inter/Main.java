package OPP.inter;

public class Main {

    public static void main(String[] args) {
//        Animal dog = new Dog();
//        Animal bird = new Bird();
//
//        dog.move();
//        bird.eat();
//
//        dog.eat();
//        bird.move();


        Runnable runnable = new InterfaceChecker();
        runnable.run();
    }
}
