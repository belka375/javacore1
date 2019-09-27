package hw11;


public class Person {
    private String name;
    private String hair;
    private EyeColors colors;

    public Person(String name, String hair, EyeColors colors) {
        this.name = name;
        this.hair = hair;
        this.colors = colors;
    }

    public void setColors(EyeColors colors) {
        this.colors = colors;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EyeColors getColors() {
        return colors;
    }

    public String getHair() {
        return hair;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println(name+" " + hair+" " + colors);
    }
}


