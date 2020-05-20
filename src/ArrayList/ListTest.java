package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ListTest {
    public static void main(String[] args) {
        ArrayList <String> cars = new ArrayList<String>(); // Create an array list object
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Toyota");
//       String myCar = cars.get(0); // Access an item
//        int myCar1 = cars.size(); // Arraylist size
//        cars.set(1, "Opel"); // Change an item
//        cars.remove(2); // remove an item
//        cars.clear(); // To remove all the elements
//        cars.size(); // Arraylist size

//        System.out.println(myCar);
//        System.out.println(myCar1);
        Collections.sort(cars);
// Loop through an ArrayList
        for (String i : cars) {
            System.out.println(i);
        }
    }

}
