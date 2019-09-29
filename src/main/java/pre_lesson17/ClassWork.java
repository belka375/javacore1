package pre_lesson17;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ClassWork {
    public static void main(String[] args) {

        String[] stringArray= new String[5];
        Integer x=5;
        Boolean c=true;
        boolean v=false;

        ArrayList<String> listOfStrings = new ArrayList<String>();
        ArrayList<LocalDateTime> listOfDates = new ArrayList<LocalDateTime>();
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        ArrayList<Boolean> listOfBooleans = new ArrayList<Boolean>();

        System.out.println(listOfStrings.size());

        listOfStrings.add("Hello, World!");

        System.out.println(listOfStrings.size());

        System.out.println(listOfStrings.get(0));

        listOfStrings.add("Hello, Students");
        listOfStrings.add("Happy to see you");
        listOfStrings.add("It is a beautiful day today))");

        System.out.println(listOfStrings.size());

        System.out.println(listOfStrings.get(3));
        listOfStrings.set(3,"I hope it is a nice weather today");
        System.out.println(listOfStrings.get(3));

        ArrayList<String> listName=new ArrayList<String>();
        listName.add("Petr");
        listName.add("Ivan");
        listName.add("Jane");
        listName.add("Sasha");
        listName.add("Tanya");
        for (String name:listName) {
            System.out.println(name);
        }
        String[] names=new String[]{"Petr", "Ivan","Jane","Sasha","Tanya"};
        for(int i=0;i<names.length;i++) {
            System.out.println(names[i]);
        }
        float f = 1.0f; int n4 = '1'; double n3 = 1.0; short n1 = 1;
        String[] arr=new String[]{"1","2","3"};
        System.out.println(arr.length);

    }
}
