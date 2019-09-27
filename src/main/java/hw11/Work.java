package hw11;

public class Work {
    public static void main(String[] args) {
        Person person = new Person("John", "blonde", EyeColors.BLUE);
        person.printInfo();
        Fruits[] fruits=new Fruits[]{Fruits.APPLE,Fruits.ORANGE,Fruits.PEACH};
        Basket basket=new Basket("Wallmart", "Broadway 13", fruits);
        basket.printInfo();
    }
}
