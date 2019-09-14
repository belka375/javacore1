package homework8;
public class Cat {
    public String name;
    public String breed;
    public int age;
    public double weight;
    public String eyeColor;
    public boolean hasKitten;

    public void printFullName(){
        System.out.println(name+" "+breed);
    }
    public void printPhysicalConditions(){
        System.out.println("Age="+age+";\nWeight="+weight+";\nEye Color="+eyeColor);
    }
}
