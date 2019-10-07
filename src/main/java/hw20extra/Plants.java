package hw20extra;

public interface Plants extends Life {

    default void needOxigen(){
        System.out.println("I am a plant");
    }
}
