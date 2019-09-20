package lesson12;

public class Mouse {
        private String brand;
   private String characteristics;
    private String color;
public Mouse(){}

    public String getBrand() {
        return brand;

    }

    public String getColor() {
        return color;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public Mouse(String color, String brand, String characteristics){
        this.brand=brand;
        this.color=color;
        this.characteristics = characteristics;
    }


    public void printMouseInfo(
    ){
        System.out.println(
                "Mouse by "+ brand+"\nIt's color is "+ color+"\nIt has following characteristics: "+ characteristics
        );
    }
}
