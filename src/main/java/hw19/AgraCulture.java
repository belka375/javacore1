package hw19;

public class AgraCulture {
    private String nameOfCulture;
    private int fieldsNumber;
    private String gatherSeason;

    public AgraCulture(String nameOfCulture,int fieldsNumber,String gatherSeason) {
        this.nameOfCulture = nameOfCulture;
        this.fieldsNumber = fieldsNumber;
        this.gatherSeason = gatherSeason;
    }
    public void printInfo(){
        System.out.println("Culture:"+nameOfCulture+"\nFields:"+fieldsNumber+"\n"+"Season for gather:"+gatherSeason);
    }
}
