package hw10;

public class Dog {
    //Atributes
    private String name;
    private String breed;
    private int age;
    private String[]immunization;

    //Constructor full
    public Dog(String name, String breed, int age, String[]immunization){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.immunization=immunization;
    }

    //Constructor default
    public Dog(){ }

    //setters
    public void setName(String name){
        this.name=name;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setImmunization(String[]immunization){
        this.immunization=immunization;
    }

    //getters
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }

    public int getAge(){
        return age;
    }
    public String[]getImmunization(){
        return immunization;
    }


    //Print
    public void printDogInfo(){
        System.out.println("                  ");
        System.out.print("\n"+name+", "+breed+", "+age+" months. Got the following vaccines: ");
        for (String vaccine:immunization) {
            System.out.print(vaccine+" ");
        }
    }







}
