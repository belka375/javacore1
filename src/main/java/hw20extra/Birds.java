package hw20extra;

public interface Birds  extends Vertebrates{
     default void howIMove(){
         System.out.println("I am a bird and i can fly");
     }
}
