public class Dog {

    public String breed;
    public String color;
    public int yearsOld;
    public boolean isMale;
    public String name;

    public void printDogsInfo(){
        System.out.println("Dog's info:\nName: "+name+";\nBreed: "+breed+";\nColor: "+color+";\nAge: "+yearsOld+";\nMale: "+isMale+".\n");
    }

    public void bark(){
        System.out.println("Woof Woof");

    }
}
