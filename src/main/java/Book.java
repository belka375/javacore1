public class Book {
    private String name;
    private String author;
    private int buyingPrice;
    private int yearOfIssue;

    public void setName(String n){
        name = n;
    }
    public void setAuthor(String a){
        author = a;
    }
    public void setBuyingPrice(int bp){
        if(bp<=0){
            System.out.println("Buying price cannot be negative");
            buyingPrice = 1;
        } else {
            buyingPrice = bp;
        }
    }
    public void setYearOfIssue(int yoi){
        if(yoi>2020 || yoi<1950){
            System.out.println("year is wrong");
            yearOfIssue = 1950;
        } else {
            yearOfIssue = yoi;
        }

    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }
}
