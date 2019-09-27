package homework.hw15;

public class Painting extends ArtItem {

    private String style;
    private String type;
    private boolean isFramed;

    public Painting(String title, String author, String medium, double width, double height,String style,String type,boolean
            isFramed) {
        super(title, author, medium, width, height);
        this.style=style;
        this.type=type;
        this.isFramed=isFramed;
    }

    public String getStyle() {
        return style;
    }

    public String getType() {
        return type;
    }
    public  boolean getIsFramed(){
        return isFramed;
    }


    public void printInfo(){
         System.out.println("title: " + title + "   author: " + author + "   meduim: " + medium + "   width: " + width + "   height: " + height+"style: "+style+"   type: "+type);
        if(isFramed==true) {
            System.out.println("framed");
        }else{
            System.out.println("no frame");
        }
    }


}
