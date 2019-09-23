package hw12;

public class Mouse {
    private String color;
    private String model;
    private int length;
    private int width;

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
        System.out.print("Mouse model: "+model+"; Mouse color: "+color+"; Mouse width: "+width+
                ";Mouse length: "+length+";");
    }
}
