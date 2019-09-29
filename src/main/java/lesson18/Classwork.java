package lesson18;

import java.util.HashMap;
import java.util.Map;

public class Classwork {
    public static void main(String[] args) {
        Map<String,String> countriesAndCapitals=new HashMap<>();
        countriesAndCapitals.put("UK","London");
        countriesAndCapitals.put("Germany", "Berlin");
        countriesAndCapitals.put("India", "New Delhi");
        countriesAndCapitals.put("Australia", "Canberra");

        for (Map.Entry<String,String> pair:countriesAndCapitals.entrySet()) {
            System.out.println("Country = "+pair.getKey()+", capital = "+pair.getValue());
        }
        countriesAndCapitals.forEach((key,value) ->{
            System.out.println("Country = "+key+", capital = "+value);
        });
       // Person Ivan=new Person();
    }


}
