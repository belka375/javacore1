package hw20extra;

public interface Bacteria extends Life {

    default void needOxigen(){
        System.out.println("I am a Bacteria");
    }
}
