package hw20extra;

public interface Reptilies extends Vertebrates {
    default void howIMove(){
        System.out.println("I am a reptilia and cold-blooded ith lay eggs, my skin is covered with hard and dry scales");
    }

}
