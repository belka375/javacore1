package lesson17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Classwork {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Hello");
        list.add("it's");
        list.add("me");
        list.add(2,"not");

//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//        for (String str:list) {
//            System.out.println(str);
//        }
//        list.forEach(str-> System.out.println(str));
//        list.forEach(System.out::println);

//        if(list.contains("not")){
//            System.out.println("we have NOT");
//        }
  //      list.remove(2);
  //      list.forEach(System.out::println);

   //     String[] arrayOfString=(String[])list.toArray();

        HashMap <String,String> hm=new HashMap<String,String>();
        hm.put("Apple", "green");
        hm.put("Peach","red");
        hm.put("Strawberry","red");
        hm.put("dill","green");

        System.out.println(hm.get("Peach"));

        HashMap<Integer,String> hm1=new HashMap<Integer,String>();
        hm1.put(0,"Hello");
        hm1.put(1,"it's");
        hm1.put(2,"me");

        for(Integer i=0;i<hm1.size();i++){
            System.out.println(hm1.get(i));
        }
        hm1.put(55,"not");
    //    hm1.remove(55);
        hm1.remove(55,"not");
    }
}
