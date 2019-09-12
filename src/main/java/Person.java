public class Person {
    //attributes, fields, properties - три названия
    public String name;
    public String lastName;
    public int age;
    public double weight;
    public String eyeColor;
    public boolean hasChildren;

    //методы
    public void printFullName(){
        System.out.println(name+" "+lastName);
    }
    // методы
    public void printPhysicalConditions(){
        System.out.println("Age = "+age+";\nWeight = "+weight+";\nEye Color = "+eyeColor);
    }

}
