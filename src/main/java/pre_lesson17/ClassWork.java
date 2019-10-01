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




    }
}
