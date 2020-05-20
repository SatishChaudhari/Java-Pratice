package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StoreNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(7);
        myNumbers.add(10);
        myNumbers.add(50);
        myNumbers.add(20);
        myNumbers.add(23);
        myNumbers.add(30);
        myNumbers.add(35);
        myNumbers.add(40);
        myNumbers.add(45);
        myNumbers.add(48);

        Collections.sort(myNumbers);
       for(int i : myNumbers){
           System.out.println(i);
       }

    }
}
