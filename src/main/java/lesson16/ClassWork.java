package lesson16;

public class ClassWork {
    public static void main(String[] args){

        Person boris=new Person("Boris","Blade");
        Person john = new Person("John", "James");
        Person sam=new Person("Samuel", "Gibbs");

        sam.printName();

        Teacher jane = new Teacher("Jane","Dobbis");
        jane.printName();

        Person ivanka = new Teacher("Ivanka", "T");
        ivanka.printName();

        System.out.println(Person.getNumber());

    }
}
