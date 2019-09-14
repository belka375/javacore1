public class Book {
    private String name;
    private String author;
    private int buyingPrice;
    private int yearOfIssue;

    public void setName(String n){
        this.name=n;
    }
    public void setAuthor(String a){
        this.author=a;
    }
    public void setBuyingPrice(int bPrice){
        if(bPrice<=0){
            System.out.println("buying price must be positive");
            buyingPrice=1;
        }else {
            buyingPrice=bPrice;
        }
    }

    public void setYearOfIssue(int year){
        if(year>2020 || year<1950){
            System.out.println("Year is wrong");
            yearOfIssue=1950;
        }else {
            yearOfIssue=year;
        }
    }

    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author;
    }
    public int getBuyingPrice(){
        return buyingPrice;
    }
    public int getYearOfIssue(){
        return yearOfIssue;
    }
}
