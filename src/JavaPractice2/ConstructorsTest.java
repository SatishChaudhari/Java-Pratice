package JavaPractice2;

public class ConstructorsTest {
    int x; // create a class variable.

    // create a class constructor for the ConstructorsTest class

    public ConstructorsTest(){
        x = 5; // Set the initial value for the class variable.

    }

    public static void main(String[] args) {
        ConstructorsTest obj = new ConstructorsTest();
        int c = obj.x;
        System.out.println(c);
    }
}
