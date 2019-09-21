package hw12;

public class Keyboard {
    private String brandName;
    private String color;
    private int numberOfKeys;
    private  String connectionType;

    public Keyboard(String brandName,String color,int numberOfKeys,String connectionType){
        this.brandName=brandName;
        this.color=color;
        this.numberOfKeys=numberOfKeys;
        this.connectionType=connectionType;
    }
    public String getBrandName() {
        return brandName;
    }
    public String getColor() {
        return color;
    }
    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }
    public String getConnectionType() {
        return connectionType;
    }
    public  void printKeyboard(){
        System.out.println("Brand:"+brandName+" "+color+"number of keys:"+numberOfKeys+","+connectionType+" connection.");
    }
}
