package homework12_13_14;

import java.time.LocalDate;

public class Company {
    private String name;
    private LocalDate yof;
    private boolean onMarket;
    private Computer computers;

    public Company (String name, LocalDate yof, boolean onMarket, Computer computers){
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

    public Computer getComputers(){
        return computers;
    }
}
