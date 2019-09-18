package homework8;
 public class Work {
    private boolean hasKitten;
    private int age;
    private double weight;
    private String eyeColor;
    private String name;
    private String breed;

    public static void main(String[] args) {
        Work cat = new Work();
        cat.breed = "Maincoon";
        cat.name = "Markiz";
        cat.eyeColor = "Blue";
        cat.weight = 18.1;
        cat.age = 5;
        cat.hasKitten = true;

        cat.printFullName();
        cat.printPhysicalConditions();
    }

    private void printFullName() {
    }

    private void printPhysicalConditions() {
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