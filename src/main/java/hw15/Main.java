package hw15;

public class Main {

    public static void main(String[] args) {

        Mammal dog = new Mammal("Bobik", 10, "Gav");
        dog.printInfo();
        dog.saySmth();

        Mammal giraffe = new Mammal("Nick", 5, "Ua-Ua");
        giraffe.printInfo();
        giraffe.saySmth();

    }

}
