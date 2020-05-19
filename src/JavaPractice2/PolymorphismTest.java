package JavaPractice2;

public class PolymorphismTest { // Super Class
    public void animalSound() {
        System.out.println("The animal make a sound");
    }
}
class Pig extends PolymorphismTest { // Sub Class
        public void animalSound() {
        System.out.println("The pig says: oinks oinks");
    }
}
class Dog extends PolymorphismTest { // Sub Class
    public void animalSound() {
        System.out.println("The Dog says: bow bow");
    }
}
class MyMainClass {
    public static void main(String[] args) {
        PolymorphismTest myAnimal = new PolymorphismTest(); // create an object
        PolymorphismTest myPig = new Pig();// Create a Pig Object
        PolymorphismTest myDog = new Dog();//Create a Dog Object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}