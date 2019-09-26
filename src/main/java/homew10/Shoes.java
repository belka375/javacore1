package homew10;
//Create 3 classes - in itch class create minimum 3 attributes (one of this attributes need be array).
//        Create getters and setter fro every attribute.
//        Create minimum 2 contractors in every Class - default and complete (you can create more constructors)
//        Create in Class Work/ main() minimum 2 objects for every class - one with complete constructor and other its default one.
//        Print all this objects with function printClass().

public class Shoes {
    private String name;
    private int[] size;
    private String color;

    public Shoes(){}

    public Shoes(String name, int[] size, String color){
        this.name=name;
        this.size=size;
        this.color=color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int[] size) {
        if (size.length!=2){
            System.out.println("Shape for "+name+" not comfortable");
        }
        this.size= size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int[] getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void printClass(){
        System.out.println("Shoes "+name+" several "+color+", different "+size[0]+" buy "+size[1]);
    }

    public void setMaterial(String leather) {
    }
}

