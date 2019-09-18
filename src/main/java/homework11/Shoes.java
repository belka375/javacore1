package homework11;

public class Shoes {
    public static void main(String[] args) {
        System.out.println(getMaterial(250));
printShoeMaterial();
    }

    public static ShoeMaterial getMaterial(int price) {
        if (price >= 300) {
            return ShoeMaterial.LEATHER;}
            if (price >= 200) {
               return ShoeMaterial.LAQUE;}
             else
                return ShoeMaterial.RUBBER;

            }



public static void printShoeMaterial(){
    System.out.println(ShoeMaterial.RUBBER);}
}
