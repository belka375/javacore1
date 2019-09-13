public class Book {

    public String name;
    public String author;
    public int numberOfPages;
    public int publishedDate;
    public boolean isNew;
    public String mainCharecterName;


    public void tellAStory(){
        System.out.println("Book " +name +" is telling a story about " +mainCharecterName+".\n");
    }

    public void bookInfo(){
        System.out.println("Book title: " +name+ ";\nAuthor: "
                        +author+ ";\nNumber of pages: "+numberOfPages+";\nYear Published: "+publishedDate+";\nNew: "+isNew+".\n");

    }
}
