package lesson16;

import java.util.ArrayList;
import java.util.List;

public class ClassWork {
    public static void main(String[] args) {

        Person boris = new Person("Boris","Blade");
        Person john=new Person("John","James");
        Person sam=new Person("Samuel","Gibbs");

        sam.printName();

        Teacher jane = new Teacher("Jane","Dobbs");
        jane.printName();

        Person ivanka = new Teacher("Ivanka","T");
        ivanka.printName();

        ivanka=john;
        ivanka.printName();


        Shape sq=new Square(4);
        Rectangle sq1=new Square(5);
        Shape cr=new Circle(8);
        Rectangle rt=new Rectangle(4,5);
        Circle cr1=new Circle(10);

        Shape[] shapes = new Shape[]{sq,sq1,cr,rt,cr1};

        List<Shape> listOfShapes = new ArrayList<Shape>();

        listOfShapes.add(sq);
        listOfShapes.add(sq1);
        listOfShapes.add(cr);
        listOfShapes.add(rt);
        listOfShapes.add(cr1);

        listOfShapes.forEach(shape-> System.out.println(shape.getSquare()));

//        for (Shape sh:shapes){
//            System.out.println(sh.getSquare());
//        }


        System.out.println(Person.getNumber());
    }



}
