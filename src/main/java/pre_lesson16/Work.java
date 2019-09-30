package pre_lesson16;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Work {
    public static void main(String [] args){
        String[] stringArray = new String[5];

        //array List
        ArrayList<String> listOfStrings = new ArrayList<String>();
        ArrayList<LocalDateTime> listOfDates = new ArrayList<LocalDateTime>();

        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();

        //UInteger it s wrapper, it s has a difference that it s has a methods and ArrayList ork ith it, but
        //don t work with int - because it s primitive type of variables

        ArrayList<Boolean> listOfBooleans = new ArrayList<Boolean>();

        //в аарай листе не нужно указывать его размер как в аррее - он может быть флексибл

        System.out.println(listOfStrings.size());

        listOfStrings.add("Hello,orld!");

        System.out.println(listOfStrings.size());

        // доступ к элементам аррай листа через индекс элемента

        System.out.println(listOfStrings.get(0));

        listOfStrings.add("Hello, Students");

        listOfStrings.add("HAppy to see you");
        listOfStrings.add("It s a beautifull day today");

        System.out.println(listOfStrings.size());

        //измениние значения одного из элементов листа арреев - череез сеты
        System.out.println(listOfStrings.get(3));

        listOfStrings.set(3,"I hope it s a nice weather today");

       System.out.println(listOfStrings.get(3));





    }
}
