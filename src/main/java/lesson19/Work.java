package lesson19;

import java.util.ArrayList;

public class Work {
    public static void main(String[] args) {
        // inner classes
        var outer = new Outer();
        var inner = outer.new Inner();
        outer.number=100;
        inner.theNumber=200;
        System.out.println(outer.number+inner.theNumber);

        var pr = new PrintIt<String>("Hello");
        pr.printInfo();

        var pr1=new PrintIt<Integer>(55);
        pr1.printInfo();

        //exeption
        try{
            //подозрительная опрераия - где может быть ошибка
            //эксептион - это класс

         //   var x=10/0;
            Math.sqrt(-7);
        }catch(Exception x){
            System.out.println("попытка деления на ноль" +x.getMessage());
        }







    }
}
