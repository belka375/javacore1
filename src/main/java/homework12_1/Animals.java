package homework12_1;
public class Animals {

    private String type;
    private String name;
    private int age;

    public Animals(String type, String name, int age){
        this.type=type;
        this.name=name;
        this.age=age;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void printAnimals(){
        System.out.println(type+ " " +name+ " " +age);
    }
}

