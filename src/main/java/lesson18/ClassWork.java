package lesson18;



import java.util.HashMap;
import java.util.Map;

public class ClassWork {
    public static void main(String[] args){
        //Map it s interface and hashmap it s hashmap
        Map<String, String> countriesAndCapitals = new HashMap<>();

        countriesAndCapitals.put("UK","London");
        countriesAndCapitals.put("Germany","Berlin");
        countriesAndCapitals.put("India","Ne Dely");
        countriesAndCapitals.put("Australia","Canberra");
        //Map.Entry - it s pair of the key&value, : - in)
        //entry.key - разбивает данные в хешмар по парам key&value

        for (Map.Entry<String ,String> pair:countriesAndCapitals.entrySet()){
            System.out.println("Country =  "+pair.getKey()+",capital = " +pair.getValue());
        }

        countriesAndCapitals.forEach((key,value)->{
            System.out.println("Country =  "+key+",capital = " +value);
        });
       // Person pr=new Person();





    }
}
