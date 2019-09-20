package hw12byTanik;

public class Mouse {

    private String model;
    private String color;
    private int width;
    private int length;

    public Mouse (String model, String color, int width, int length){
        this.model=model;
        this.color=color;
        this.width=width;
        this.length=length;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void printMouse(){
        System.out.println("Mouse model: "+model+";\nMouse color: "+color+";\nMouse width: "+width+
                ";\nMouse length: "+length+";");
    }
}
