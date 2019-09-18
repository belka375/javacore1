package homework11;

public class Cats {
    private String name;
    private int age;
    private Breeds[] breeds;

    public Cats(){
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

    public void setBreeds(Breeds[] breeds) {

        this.breeds = breeds;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public Breeds[] getBreeds() {
        return breeds;
    }
    public void printBreeds() {
        System.out.println(name + "" + age + "");
        for (Breeds b : breeds) {

            System.out.println(b + " ");

        }}}




