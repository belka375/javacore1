package hw20extra;

public interface Fish extends Vertebrates {
    default void hoIMove(){
        System.out.println("I am Fish");
    }
}
