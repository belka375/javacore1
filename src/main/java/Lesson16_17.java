import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Lesson16_17 {
    public static void main(String[] args) {

        printGreaterNumber(506, 678);
    }
    private static boolean firstGreater(int x, int y){
        if (x>y)
            return true;
        return false;
    }
    private static void printGreaterNumber(int f, int k){
        int greater;
        if(firstGreater(f,k)){
            greater=f;
        }else {
            greater = k;
        }
        System.out.println("The greatest number is: "+greater);
    }
}

class Lesson16_17_2{
    public static   void main(String[] args) {
        printGreatestNumber(44,21);

    }

    public static boolean greatestNumber(int a, int b){
        if(a>b)
        return true;
        return false;
    }
    public static void  printGreatestNumber(int x, int y){
        int greater;
        if(greatestNumber(x,y)){
            greater = x;
        }else {
            greater=y;
        }
        System.out.println(greater);
    }
}
class Lesson16_17_3 {
    public static void main(String[] args) {

        printInfo(30);
    }

    public static boolean printSN(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;

    }

    public static void printInfo(int m) {
        for (int i = 2; i <= m; i++) {
            if(printSN(i))
            System.out.println(i);
        }
    }
}
class Lesson16_17_4 {
    public static void main(String[] args) {

        String[] colors = new String[]{"red", "blue", "green", "Black", "Grey", "Pink"};

        String[] arr = new String[]{"red", "blue", "green", "Black", "Grey", "Pink"};

        List<String>colors1 = Arrays.asList(new String[]{"red", "blue", "green", "Black", "Grey", "Pink"});

        colors1.add("orange");
        colors1.add("yellow");
        System.out.println(colors1.get(3));

        printFourLetter(colors);


        StringBuilder builder = new StringBuilder();
        for(String s: arr){
            builder.append(s);
        }
        String str1 = builder.toString();

        System.out.println(str1);

    }

        private static void printFourLetter(String[] str) {
            for (String x : str) {
                if (x.length() == 4) {
                    System.out.println(x);
                }
            }
        }


 }





