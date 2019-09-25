package hw15;

public class Brick implements ProtoElement {
    private String nameOfElement;
    private int length;
    private int height;
    private int width;

    public Brick(String nameOfElement, int length, int height, int width){
        this.nameOfElement=nameOfElement;
        this.length=length;
        this.height=height;
        this.width=width;
    }

    @Override
    public int volume() {
        int v=length*height*width;
        return v;
    }


    @Override
    public void getInfo() {
        System.out.println(nameOfElement+" volume = "+volume());
    }
}
