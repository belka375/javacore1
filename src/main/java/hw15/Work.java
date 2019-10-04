package hw15;

public class Work {
    public static void main(String[] args) {
        Teacher ross = new Teacher("Ross", "Geller");
        Student joe = new Student("Joe", "Tribianni");

        Person mark = new Teacher("Mark", "Watson");
        Person shelly = new Student("Shelly", "Smith");

        ross.printInfo();
        joe.printInfo();
        mark.printInfo();
        shelly.printInfo();
    }
}
