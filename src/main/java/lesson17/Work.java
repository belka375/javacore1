package lesson17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Work {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("it");
        list.add("me");

        list.add(2,"not");

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        for(String str:list){
            System.out.println(str);
        }
        //лямбда или arrow methos -  для каждой стр в листе

        list.forEach(str -> System.out.println(str));
        if(list.contains("not")){
            System.out.println("we have NOT");
        }

        list.remove(2);
        for(String str:list){
            System.out.println(str);
        }

        //hashmap - у мее в отличие от array list  нет индексов а есть key and value

        HashMap<String,String > hm = new HashMap<String, String>();

        //key must be unique, and by this key we have retrive elements

        hm.put("apple","green");
        hm.put("peach","red");
        hm.put("straberry","red");
        hm.put("dill","green");

        System.out.println(hm.get("peach"));

        HashMap<Integer,String> hm1 = new HashMap<Integer, String>();
        hm1.put(0,"Hello");
        hm1.put(1,"It's");
        hm1.put(2,"me");

        for(int i=0;i<hm1.size();i++){
            System.out.println(hm1.get(i));
        }
        hm1.put(55,"not");
        hm1.remove(55);






    }

}
