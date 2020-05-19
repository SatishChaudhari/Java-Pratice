package JavaPractice2;
//  You will often see Java programs that have either static or public attributes and methods.
// In the example above, we created a static method, which means that it can be accessed without
// creating an object of the class, unlike public, which can only be accessed by objects:

public class ClassMethodTest {

    static void firstMethod(){ // In static method you can access only static method and static variables.

        System.out.println("First method");
    }
    private void secondMethod(){ // You can access other method

        System.out.println("Second method");

    }
    public void thirdMethod(){ // You can access other method

        System.out.println("Third method");
    }


    public static void main(String[] args) {
        // Static method you can access without create an object.
        firstMethod();
        // For private and public you need to create an object to access it.
        ClassMethodTest obj1 = new ClassMethodTest();
        obj1.secondMethod();
       ClassMethodTest obj2 = new ClassMethodTest();
       obj2.thirdMethod();

    }

}
