package OPP;

public class Main {

    public static void main(String[] args) {
        //Creating Objects of Cat class
        Cat thor = new Cat();
        Cat rambo = new Cat();

        //Setting values for Thor cat
        thor.name = "Thor";
        thor.age = 2;
        thor.color = "Black";
        thor.breed = "Persian";
        thor.sleep();

        //Setting values for Rambo cat
        rambo.name = "Rambo";
        rambo.age = 3;
        rambo.color = "White";
        rambo.breed = "Siamese";
        rambo.play();

    }
}
