package HomeWork8;

public class Cat {

    int age;
    String name;
    double weight;
    boolean isFeamale;
    String energy;
    Pendant pedant;
    String mood;

    // Method (behave)

    public void voice(){
        System.out.println( "Meow");
    }

    public void sleep() {
        System.out.println("Frrrrrr");

    }

    public void tellMeAboutYourself(){
        System.out.println("Age="+age+";\nWeight="+weight+";\nGood="+mood+"");
    }
}
