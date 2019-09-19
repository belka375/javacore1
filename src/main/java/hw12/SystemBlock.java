package hw12;

public class SystemBlock {
    private String model;
    private String brand;
    private String formfactor;
    private Collors collor;
    private Kishki[] kishki;

    public SystemBlock(String model, String brand, String formfactor, Collors collor, Kishki[] kishki){
        this.model=model;
        this.brand=brand;
        this.formfactor=formfactor;
        this.collor=collor;
        this.kishki=kishki;
    }

    public void printClass(){
        System.out.println("System Blok — "+model+" by "+brand+", Formfactor — "+formfactor+", Collor"+collor);
        for (Kishki kishki:kishki) {
            kishki.printClass(kishki);
        }
    }

}
