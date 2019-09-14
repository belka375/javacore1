package homework8;
public class Pet {
    public static void main(String[] args) {
        Pet cat = new Pet();
        cat.breed = "Maincoon";
        cat.name = "Markiz";
        cat.eyeColor = "Blue";
        cat.weight = 18;
        cat.age = 5;
        cat.hasKitten = true;

        cat.printFullName();
        cat.printPhysicalConditions();
    }

}



//    public String name;
//    public String breed;
//    public int age;
//    public double weight;
//    public String eyeColor;
//    public boolean hasKitten;
//
//    public void printFullName(){
//        System.out.println(name+" "+breed);
//    }
//    public void printPhysicalConditions(){
//        System.out.println("Age="+age+";\nWeight="+weight+";\nEye Color="+eyeColor);