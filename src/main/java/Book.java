public class Book {
    private String name;
    private String author;
    private int buyingPrice;
    private int yearOfIssue;

    private String chip;

    public void setName(String name){
        this.name=name;
    }
    public void setAuthor(String a){
        author=a;
    }
    public void setBuyingPrice(int bprice){
        if(bprice<=0){
            System.out.println("buying price must be positive");
            buyingPrice=1;
        }else{
            buyingPrice=bprice;
        }
    }
    public void setYearOfIssue(int year){
        if(year>2020 || year<1950){
            System.out.println("Year is wrong");
            yearOfIssue=1950;
        }else{
            yearOfIssue=year;
        }
    }
    public String getName(){
        return name;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getBuyingPrice(){
        return buyingPrice;
    }
    public int getYearOfIssue(){
        return yearOfIssue;
    }
}
