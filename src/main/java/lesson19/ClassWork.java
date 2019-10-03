package lesson19;

import java.util.ArrayList;

public class ClassWork {
    public static void main(String[] args) {
        var outer = new Outer();
        var inner = outer.new Inner();
        outer.number=100;
        inner.theNumber=200;
        System.out.println(outer.number+inner.theNumber);

        var pr=new PrintIt<String>("Hello");
        pr.printInfo();

        var pr1=new PrintIt<Integer>(55);
        pr1.printInfo();


       try{
           var x=10/0;


       }catch(ArithmeticException x){
           System.out.println("trying divide by zero"+x.getMessage());
       }




    }
}
