package lesson17;

import java.util.ArrayList;
import java.util.List;

public class ClassWork {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello ");
        list.add("it ");
        list.add("is ");
        list.add("me!!!!");
        list.add(3, "not ");

        System.out.println(list.get(4));
        System.out.println("=====================");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println("\n=====================");

        for (String str : list) {
            System.out.print(str);
        }
        System.out.println("\n=====================");

        list.forEach(str -> System.out.print(str));

        System.out.println("\n=====================");

        if (list.contains("not ")) {
            System.out.println("we have not");

            list.remove(1);
            list.forEach(str ->System.out.println(str));
        }
    }


}

