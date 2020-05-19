package JavaPractice1;

import java.util.HashMap;

public class HashmapTest {

    public static void main(String[] args){
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("India", "Delhi");
        capitalCities.put("USA", "Washington DC");
//        capitalCities.remove("England");
//        capitalCities.clear();
//        capitalCities.size();

//        System.out.println(capitalCities.get("England"));
//        System.out.println(capitalCities.get("India"));
//        System.out.println(capitalCities.get("USA"));
//        System.out.println(capitalCities.size());
//
//        for(String i : capitalCities.keySet()){
//            System.out.println(i);
//        }
//        for(String i : capitalCities.values()){
//            System.out.println(i);
//        }
        for(String i : capitalCities.keySet()){
            System.out.println("Key: " + i + "\n value: " + capitalCities.get(i));
        }

    }




}
