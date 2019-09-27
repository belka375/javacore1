package homework.hw15;

public class ArtItem implements Draw {
    protected String title;
    protected String author;
    protected String medium;
    protected double width;
    protected double height;

    public ArtItem(String title, String author, String medium, double width, double height) {
        this.title = title;
        this.medium = medium;
        this.author = author;
        this.width = width;
        this.height = height;
    }

    public String getSubject() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    public String getMedium() {
        return medium;
    }


    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


    @Override
    public void printInfo() {
        System.out.println("title: " + title + "   author: " + author + "   meduim: " + medium + "   width: " + width + "   height: " + height);
    }

    public void printMedium() {
        System.out.println("medium: " + medium);
    }


}
