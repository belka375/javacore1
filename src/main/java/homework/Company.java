package homework;

import java.time.LocalDate;

public class Company implements PrintInfo {
    private String name;
    private LocalDate yof;
    private boolean onMarket;
    private Computer[] computers;

    public Company (String name, LocalDate yof, boolean onMarket, Computer[] computers){
        this.name = name;
        this.onMarket = onMarket;
        this.yof = yof;
        this.computers = computers;
    }

    public String getName() {
        return name;
    }

    public LocalDate getYof() {
        return yof;
    }

    public boolean isOnMarket() {
        return onMarket;
    }

    public Computer[] getComputers(){
        return computers;
    }

    @Override
    public void printInfo() {
        System.out.println(name);
        System.out.println(yof);
        System.out.println();
        for (Computer c: computers){
            System.out.println(c.getMon().getMake());
            System.out.println(c.getMon().getModel());
            System.out.println();
        }
    }
}
