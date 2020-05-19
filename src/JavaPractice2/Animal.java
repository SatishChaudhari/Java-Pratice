package JavaPractice2;

public interface Animal {
    public void animalSound(); // interface method does not have a body.
    public void run(); //interface method does not have a body.
    public void sleep();

}
//Implements Animal interface
 class Cat implements Animal{
    public void animalSound(){ //Interface method body is provided here!
        System.out.println("The Cat Says: miow miow");
    }
    public void run(){//Interface method body is provided here!
        System.out.println("Cat run fast");
    }
    public void sleep(){//Interface method body is provided here!
        System.out.println("Cat can't sleep whole night!");
    }
}
class MainClassTwo{
    public static void main(String[] args) {
        Cat myCat = new Cat(); // Create a Cat class object.
        myCat.animalSound();
        myCat.run();
        myCat.sleep();

    }
}