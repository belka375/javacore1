public class Book {
    private String name;
    private String author;
    private int buyingPrice;

    private int yearofIssue;
    public void setName(String n){
        name=n;

    }
    public void setAuthor(String a) {
        author = a;
    }
    public void setBuyingPrice(int bPrice){
        if(bPrice<=0){
            System.out.println("buying price must be positive");
            buyingPrice=1;
        }else{
            buyingPrice=bPrice;
        }
    }
    public void setYearofIssue(int year){
        if(year>2020|| year<1950){
            System.out.println("Year is wrong");
            yearofIssue=1950;
        }else{
            yearofIssue=year;
        }
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getBuyingPrice(){
        return  buyingPrice;
    }
    public int getYearofIssue(){
        return yearofIssue;
    }

}
