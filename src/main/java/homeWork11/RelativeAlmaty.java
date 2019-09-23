package homeWork11;

public class RelativeAlmaty {

    private Cousins name;
    private String lastName;
    private int age;
    private String mama;
    private String papa;

    public RelativeAlmaty(Cousins name, String lastName, int age, String mama, String papa){
        this.lastName = lastName;
        this.papa = papa;
        this.mama = mama;
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPapa() {
        return papa;
    }

    public String getMama() {
        return mama;
    }

    public Cousins getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public static void printCousin(){
        System.out.println("My Cousin is "+ name +" " + lastname+);
    }
}
