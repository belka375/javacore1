package homework10;

public class Coworker {
    private String name;
    private int age;
    private String[] personality;

    public Coworker(String name, int age, String[] personality) {
        this.name = name;
        this.age = age;
        this.personality = personality;

    }

    public void print() {
        System.out.println("My coworker's name is " + name + ". He is " + age + " years old");
        System.out.print("He is ");
        for (String pers : personality
        ) {
            System.out.println(pers+ ", ");

        }
    }

    public Coworker() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPersonality(String[] personality) {
        this.personality = personality;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String[] getPersonality() {
        return personality;
    }

    public void printCoworker() {
        System.out.println("My coworker's name is " + getName() + ". He is " + getAge() + " years old");
        System.out.print("He is ");
        for (String pers : getPersonality()
        ) {
            System.out.print(pers+", ");
        }
    }
}



