package lesson16;

import lesson13.Address;
public class ClassWork {
    public static void main(String[] args) {

        Person boris = new Person("Boris", 1950, "Kotov", 122, "Cedar ave", "NY", "StatenIsland", 10306);
        Teacher boriska = new Teacher("Boris", 1950, "Kotov", 122, "Cedar ave", "NY", "StatenIsland", 10306, "Professor", 123 );
        Person borisok = new Teacher("Boris", 1950, "Kotov", 122, "Cedar ave", "NY", "StatenIsland", 10306, "Professor", 123);

        boris.printPerson();

        boriska.setLastName("Schwedov"); boriska.setName("Ivan");
        boriska.printPerson();
    }
}
