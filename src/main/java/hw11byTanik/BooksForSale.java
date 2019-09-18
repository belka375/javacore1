package hw11byTanik;

public class BooksForSale {

    private String bookName;
    private String bookAuthor;
    private BookCondition bookCondition;

    public BooksForSale(){
            }

    public BooksForSale(String name, String author, BookCondition condition) {
        this.bookName=name;
        this.bookCondition=condition;
        this.bookAuthor=author;
    }

    public void setBookName(String bName) {
        this.bookName = bName;
    }

    public void setBookAuthor(String bAuthor){
        this.bookAuthor=bAuthor;
    }

    public void setBookCondition(BookCondition bCondition){
        this.bookCondition=bCondition;
    }

    public String getBookName(){
        return bookName;
    }

    public String getBookAuthor(){
        return bookAuthor;
    }

    public BookCondition getBookCondition(){
        return bookCondition;
    }

    public void printBookInfo(){
        System.out.println("Title: "+bookName+";\nAuthor: "+bookAuthor+";\nCondition: "+bookCondition+".");
    }
}
