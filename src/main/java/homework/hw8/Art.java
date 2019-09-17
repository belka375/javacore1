package homework.hw8;

public class Art {

    public String author;
    public String title;
    public int year;
    public int height;
    public double width;
    public double price;
    public boolean frame;
    public boolean onSale;
    public boolean location;

    public void printDimensions() {
        System.out.println("width= " + width + "  height= " + height);
    }


    public void hang() {
        System.out.println("OK");
    }


    public void fullName() {
        System.out.println(title + "  by " + author);
    }


    public void drop() {
        if (location = true) {System.out.println("in place");
        } else {
            System.out.println("Attention! Check painting #3");}
    }

    public void hasFrame() {
        if (frame = true) {System.out.println("Framed");
        } else {
            System.out.println("No frame");}
    }

}


