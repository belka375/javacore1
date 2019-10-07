package hw20extra;

public interface Fungi extends Life {

    default void needOxigen(){
        System.out.println("I am a Fungi");
    }
}
