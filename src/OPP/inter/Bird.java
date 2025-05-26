package OPP.inter;

public class Bird implements Animal{

    @Override
    public void move() {
        System.out.println("The bird is flying");
    }

    public void eat(){
        System.out.println("The bird is eating seeds");
    }

}
