package ArrayList;
//Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

public class WrapperClassTest {
    public static void main(String[] args) {
        // Use wrapper type variable
        Integer myInt = 10;
        Double myDouble = 20.150;
        Character myChar = 'A';
    // Print the value
//        System.out.println(myInt);
//        System.out.println(myDouble);
//        System.out.println(myChar);

    // You can also print using below method, result would be same.
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
    }
}
