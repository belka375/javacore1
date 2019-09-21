package lesson12;

public class Mouse {
    private String brand;
    private String name;
    private Boolean isWireless;

    public Mouse(String brand, String name, Boolean isWireless){
        this.brand=brand;
        this.name=name;
        this.isWireless=isWireless;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public Boolean getWireless() {
        return isWireless;
    }
    public void printMouseInfo(){
        System.out.println("Mouse: "+brand+" "+name);
        if(isWireless){
            System.out.println("Wireless");
        }else{
            System.out.println("Wired");
        }
    }
}
