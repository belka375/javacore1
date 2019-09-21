package lesson12;

public class Keyboard {
    private String brand;
    private String model;
    private String color;
    private Boolean isWireless;

    public Keyboard(String brand, String model, String color, boolean isWireless){
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.isWireless=isWireless;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Boolean getWireless() {
        return isWireless;
    }

    public String getColor() {
        return color;
    }

    public void printKeyboardInfo(){
        System.out.println("Keyboard: "+brand+" "+model+" "+color);
        if(isWireless){
            System.out.println("Wireless");
        }else{
            System.out.println("Wired");
        }
    }
}
