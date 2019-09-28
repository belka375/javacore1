package hw14_2;

public class Dimensions {
    private int length;
    private int width;
    private int depth;

    public Dimensions(int length, int width, int depth) {
        this.length = length;
        this.width = width;
        this.depth = depth;
    }

    public int getDepth() {
        return depth;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    public void printPoolDimensions(){
        System.out.println("Length: "+length+"\nWidth: "+width+"\nDepth: "+depth);
    }

}
