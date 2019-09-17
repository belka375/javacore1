public class Person {

    public String name;
    public String lastName;
    public int age;
    public double weight;
    public String eyeColor;
    public boolean hasChildren;


    public void printFullName(){
        System.out.println(name+" "+lastName);
    }
    public void printPhysicalConditions(){
        System.out.println("Age="+age+";\nWeight="+weight+";\nEye Color="+eyeColor);
    }
 }
