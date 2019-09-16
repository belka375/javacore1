package hw10;

public class Vitamins {
    private String name;
    private String[] vitaminsList;
    private String form;
    private int numberOfCaps;

    public Vitamins() {
    }

    public Vitamins(String name, String[] vitaminsList, String form, int numberOfCaps) {
        this.form = form;
        this.vitaminsList = vitaminsList;
        this.name = name;
        this.numberOfCaps = numberOfCaps;
    }

    public Vitamins(String old_people, String[] vitaminList, String liquid, String s) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVitaminsList(String[] vitaminsList) {
        this.vitaminsList = vitaminsList;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public void setNumberOfCaps(int numberOfCaps) {
        this.numberOfCaps = numberOfCaps;
    }

    public String getName() {
        return name;
    }

    public String[] getVitaminsList() {
        return vitaminsList;
    }

    public int getNumberOfCaps() {
        return numberOfCaps;
    }

    public String getForm() {
        return form;
    }

    public void printVitaminsinfo() {
        System.out.println(name + " Vitamins," + numberOfCaps + " tabs," + form+" form");
            for (String vitamins : vitaminsList) {
                System.out.print(vitamins);
            }
    }
}





