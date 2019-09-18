package lesson11;

import java.awt.*;

public class Classwork {
    public static final int TEMPERATURA = 55;

    public static void main(String[] args) {

        SchoolType st = getSchoollType(8);
        System.out.println(st);

        Lipstick lipstick = new Lipstick(Colors.PINK_PINK,50);
        lipstick.setColor(Colors.GREY);



        Colors col1 = Colors.RED;
        Colors col2 = col1;
        Colors col3 = Colors.BLACK;
        printColor(Colors.GREEN);
        Colors [] colArray = new Colors[]{Colors.BLACK,Colors.BLUE, Colors.GREEN, Colors.ORANGE};
        printColor(colArray);

    }

    public  static SchoolType getSchoollType(int grade){
        if(grade>8){
            return SchoolType.HIGT;

        }
        if (grade>5){
            return SchoolType.MIDDLE;
        }
        return SchoolType.ELEMENTARY;
    }
    public static void printColor (Colors c){
        System.out.println(c);
    }
    public static  void printColor(Colors[] c){
        for(Colors cc:c){
            System.out.println(cc);

        }
    }
}

