package hw14byTanik;

public class ApartmentComplex {

    private String name;
    private Townhouse[] townhouses;
    private Condo[] condos;

    public ApartmentComplex(String name, Townhouse[] townhouses, Condo[] condos){
        this.name=name;
        this.townhouses = townhouses;
        this.condos=condos;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTownhouses(Townhouse[] townhouses) {
        this.townhouses = townhouses;
    }

    public void setCondos(Condo[] condos) {
        this.condos = condos;
    }

    public String getName() {
        return name;
    }

    public Townhouse[] getTownhouses() {
        return townhouses;
    }

    public Condo[] getCondos() {
        return condos;
    }

    public int getUnitsAvailable() {
        int availCondo=0;
        int availTh=0;

        for (Townhouse th: townhouses) {
            if (th.getAvailable() == true) {
                availTh = availTh + 1;
            }
        }
        for (Condo c: condos){
            if (c.getAvailable()==true){
                    availCondo=availCondo+1;
                }
        }
        return availCondo+availTh;
    }

    public void printAppartmentInfo() {
        System.out.println("Appartment Complex Name: " + name + "\nNumber of Units Available: " + getUnitsAvailable());
        for (Townhouse th : townhouses) {
            th.printTownhouse();
        }
        for (Condo c: condos) {
            c.printCondo();
        }
    }

    }

