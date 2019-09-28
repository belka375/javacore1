package lesson16;

public class ClassWork {
    public static void main(String[] args) {

        Person boris=new Person("Boris", "Blade");
        Person john=new Person("John", "James");
        Person sam=new Person("Samuel", "Gibbs");

        sam.printName();

        Teacher jane=new Teacher("Jane", "Dobbs");
        jane.printName();


        Person ivanka = new Teacher("Ivanka", "T");
        ivanka.printName();

        ivanka=john;
        ivanka.printName();

        Shape sq=new Square(4);
        Rectangular sq1=new  Square(5);
        Shape cr=new Circle(8);
        Rectangular rt=new Rectangular(4,5);
        Circle cr1=new Circle(10);

        Shape[]shapes= new Shape[]{sq,sq1,cr,rt,cr1};
        for (Shape sh: shapes) {
            System.out.println(sh.getSquare());

        }

        System.out.println(Person.getNumber());
    }
}
