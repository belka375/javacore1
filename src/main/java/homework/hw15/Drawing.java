package homework.hw15;

public class Drawing extends ArtItem {
    private String name;
    private boolean isPrint;

    public Drawing(String title, String author, String medium, double width, double height, String name, boolean isPrint) {
        super(title, author, medium, width, height);
        this.name = name;
        this.isPrint = isPrint;
    }

    ;

    public String getName() {
        return name;
    }

    public boolean getIsPrint() {
        return isPrint;
    }


    public void printInfo() {
        System.out.println("title: " + title + "   author: " + author + "   medium: " + medium + "   width: " + width + "   height: " + height + "   name: " + name);
        if (isPrint == true) {
            System.out.println("print");
        } else {
            System.out.println("original");
        }
    }
}
