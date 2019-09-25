package workHw15;
/*
 * Homework 15
 *Create interface and two classes which implement it
 *Create two objects of each class type of interface
 */

public class Work {

    public static void main(String[] args) {

    Vehicle car1 = new Car(4,"Ford","Fiesta","Black" );
    Vehicle bus1 = new Bus (40,"School bus","Blue Bird","yellow");
    car1.move();
    bus1.move();

    }


}
