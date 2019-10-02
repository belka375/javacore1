import lesson16.Shape;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MyHashMaps{

    public static void main(String[] args) {
        //key value
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("Iman", 12);
        hm.put("Aibek", 21);
        hm.put("Bika", 18);
        hm.put("Baur", 44);
        hm.put("Tanya", 47);
        hm.put("Tanya", 44);
        hm.remove("Tanya");

        System.out.println("=========================");
        System.out.println(hm);
        System.out.println("=========================");
        System.out.println(hm.size());
        System.out.println("=========================");
        System.out.println(hm.clone());
        System.out.println("=========================");
        System.out.println(hm.containsValue(45));
        System.out.println("=========================");


        Map<String, String> countriesAndCapitals = new HashMap<>();
        countriesAndCapitals.put("Kazakhstan", "Astana");
        countriesAndCapitals.put("Russia", "Moscow");
        countriesAndCapitals.put("USA", "Washington");
        countriesAndCapitals.put("UK", "London");
        countriesAndCapitals.put("Germany", "Berlin");
        countriesAndCapitals.put("India", "New Delhi");
        countriesAndCapitals.put("Australia", "Canberra");

        for(Map.Entry<String, String> pair:countriesAndCapitals.entrySet()){
            System.out.println("Country = " + pair.getKey()+" , capital = "+pair.getValue());
        }
        System.out.println("=========================");

        countriesAndCapitals.forEach((key, value)->{
            System.out.println("Country = " + key +" , capital = "+ value);
        });




    };







    }





