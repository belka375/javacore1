package hw20extra;

public interface Amphibians extends Vertebrates {
    default void hoIMove(){
        System.out.println("I am amphibia");
    }
}
