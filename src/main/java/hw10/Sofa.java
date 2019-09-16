package hw10;

public class Sofa {
    private String type;
    private int[] size;
    private String color;

    public Sofa(){}
    public Sofa(String type, int[] size, String color){
    this.type=type;
    this.size=size;
    this.color=color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(int[] size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public int[] getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void printSofaInfo(){
        System.out.println("*************");
        System.out.println(type+" sofa\n"+"Size in inches: long = "+size[0]+" wide = "+size[1]+"\nColor is "+color);
    }
}
