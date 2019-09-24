package homeWork11;

public class Relative {
    private Sons name;
    private int age;
    private String sport;

    public Relative(Sons name, int age, String sport){
        this.sport = sport;
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getAge() {
        return age;
    }

    public String getSport() {
        return sport;
    }

    public Sons getName() {
        return name;
    }

    public void printSons(){
        System.out.println("My lovely son is "+ name + " he is "+age + " years old "+ "and he likes " + sport);
    }
}

