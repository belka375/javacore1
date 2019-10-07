package hw20extra;

public interface Mammals extends Vertebrates {

    default void howIMove(){
        System.out.println("I am mammal");
    }
    void longOfHair();

}
