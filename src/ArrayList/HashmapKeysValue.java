package ArrayList;

import java.util.HashMap;

public class HashmapKeysValue {
    public static void main(String[] args) {
        //Create a HashMap object
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        // Add Key & Value (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Mike", 35);
        for(String i : people.keySet()){
            System.out.println("Key:"+ i + " & Value:"+ people.get(i));
        }
    }
}
