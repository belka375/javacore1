package homew15;

public class Dress extends Clothes{
    public int lenght;
    public String material;

    public Dress(String model, String gender) {
        super(model, gender);
    }

    public Dress(int lenght,String material,String model,String gender){
        super(model, gender);
        this.lenght=lenght;
        this.material=material;

    }
    public int getLenght(){
        return lenght;


    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void season() {

    }

    @Override
    public void printOutfitInfo() {

    }
}
