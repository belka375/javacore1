package homew15;

public class Tshirt extends Clothes {
    public int size;
    public String color;

    public Tshirt(int size, String color, String model, String gender) {


        super (model, gender);
        this.size = size;
        this.color = color;

    }



    public int getSize() {
        return size;
    }

    public String getColor(){
        return color;
    }

    @Override
    public void printOutfitInfo() {

    }
}