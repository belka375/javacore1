package lesson16;

public class Classwork {
    public static void main(String[] args) {
        Person boris=new Person("Boris","Blade");
        Person john=new Person("John", "James");
        Person sam=new Person("Samuel", "Gibbs");
        sam.printName();
        Teacher jane=new Teacher("Jane", "Dobbs");
        jane.printName();

        Person ivanka=new Teacher("Ivanka", "T");
        ivanka.printName();
        ivanka=john;
        ivanka.printName();
  //      jane=boris; 

        Shape sq=new Square(4);
        Rectangle sql=new Square(5);

        Shape cr =new Circle(43);
        Rectangle rt=new Rectangle(4,5);
        Circle crl=new Circle(10);

        Shape[] shapes=new Shape[]{sq,sql,cr,rt,crl};
        for(Shape sh:shapes){
            System.out.println(sh.getSquare());
        }

        System.out.println(Person.getNumber());


    }
}
