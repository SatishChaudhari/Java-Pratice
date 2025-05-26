package OPP.inter;

public class Dog implements Animal{

    @Override
    public void eat(){
        System.out.println("The Dog is eating food");
    }

    @Override
    public void move() {
        System.out.println("The Dog is running.");
    }
}
