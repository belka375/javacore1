package homew15;

abstract class Clothes implements Outfit{
    private String model;
    private String gender;


    public void season() {
        System.out.println("This collestion include "+model+gender);
    }

    public Clothes (String model,String gender){
        this.model=model;
        this.gender=gender;

    }
}
