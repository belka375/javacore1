public class Book {
    private String name;
    private  String  author;
    private int buyingPrice;
    private int yeaOfIssue;

    public void setName(String name){
        this.name=name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBuyingPrice(int price) {
        if(price<=0){
            System.out.println("byying price must be more than 0");
            buyingPrice=1;
        }else {
            this.buyingPrice = buyingPrice;
        }
    }

    public void setYeaOfIssue(int year) {
        if(year>2020 || year<1950){
            System.out.println("Year is wrong");
            yeaOfIssue=1950;
        }else {
            this.yeaOfIssue = yeaOfIssue;
        }
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public int getYeaOfIssue() {
        return yeaOfIssue;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
}
