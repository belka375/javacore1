package homework11;

public class Cats {
    private String name;
    private int age;
    private Pets[] breeds;

    public Cats(String name, int age, Pets[] breeds){
        this.name=name;
        this.age=age;
        this.breeds=breeds;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreeds(Pets[] breeds) {
        this.breeds = breeds;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Pets[] getBreeds() {
        return breeds;
    }
}



