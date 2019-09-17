package lesson11;

import java.awt.*;

public class Classwork {
    public static final int TEMPERATURE = 55;// CONSTANTA - NOT CHANGEABLE
    public static void main(String[]args){

        SchoolType st=getSchoolType(9);
        System.out.println(st);

        Lipstick lipstick=new Lipstick(Colors.PINK, 50);
        lipstick.setColor(Colors.GREEN);


        Colors col1=Colors.RED;
        Colors col2=col1;
        Colors col3=Colors.BLACK;
        printColor(Colors.GREEN);

        Colors[]colArray=new Colors[]{Colors.BLACK, Colors.GREEN,Colors.BLUE,Colors.ORANGE};

        printColor(colArray);


    }

    public static SchoolType getSchoolType(int grade){
        if(grade>8){
            return SchoolType.HIGH;
        }
        if(grade>5){
            return SchoolType.MIDDLE;
        } else{
            return  SchoolType.ELEMENTARY;
        }
    }

    public static void printColor(Colors c){
        System.out.println(c);
    }

    public static void printColor(Colors[] c){
        for (Colors cc:c) {
            System.out.println(cc);

        }

    }


}
