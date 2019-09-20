package workHw12;

public class Keyboard{
    private  String brand;
    private Language lang;

    // constructor
    public Keyboard (Language lang,String brand ){

        this.lang = lang;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public Language getLang() {
        return lang;
    }
}

