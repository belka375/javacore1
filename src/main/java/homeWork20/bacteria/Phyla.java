package homeWork20.bacteria;

public class Phyla implements Bacteria {
    String name;
    int year;

    public Phyla(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public void discover() {
        System.out.println(name + " was discovered in " + year+".");

    }

    @Override
    public void food() {
        System.out.println(" With good health habits, you can protect yourself and your children from =>" + name);
    }
}
