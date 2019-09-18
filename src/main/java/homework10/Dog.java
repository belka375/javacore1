package homework10;

public class Dog {
    private String name;
    private int age;
    private String[] characteristics;

    public Dog(){}
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
    this.age=age;}

    public void setCharacteristics(String[] characteristics) {
        this.characteristics = characteristics;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String[] getCharacteristics() {
        return characteristics;
    }


    public Dog( String name, int age, String[] characteristics ){
        this.name=name;
        this.age=age;
        this.characteristics=characteristics;

    }
    public void printDogInfo() {
        System.out.println("Dog's name: " + name + "\nIt's age: " + age + "\nIt's characteristics: ");
        for (String charac : characteristics
        ) {
            System.out.println(charac);

        }
    }
        public void printInfo(){
            System.out.println("Dog's name: "+ getName()+ "\nIt's age: " + getAge() + "\nIt's characteristics: ");
            for (String charac:getCharacteristics()
            ) {
                System.out.println(charac);

        }
    }

}





