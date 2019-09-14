public class Methods {
    public static void main(String[] args) {

        System.out.println("***********************");

        Book triDruga = new Book();
        //triDruga.author ="Some name";
        //triDruga.name = "Tri Druga";
        triDruga.setName("Tri Druga");
        triDruga.setAuthor("Pushkin");

        triDruga.setBuyingPrice(-12);

        String bookName = triDruga.getName();
        String bookAuthor = triDruga.getAuthor();
        int bPrice = triDruga.getBuyingPrice();
        int yr=triDruga.getYearofIssue();


        System.out.println(bookName+ ", "+bookAuthor+ ", "+ bPrice+ ", "+yr);


        CellPhone cf=new CellPhone();

        cf.setBrand("Nokia");

//        Book triDruga = new Book();
//
//        triDruga.setName("Tri Druga");
//        triDruga.setAuthor("Pushkin");
//        triDruga.setBuyingPrice(-12);
//        triDruga.setYearOfIssue(1550);
//
//        String bookName= triDruga.getName();
//        String bookAuthor=triDruga.getAuthor();
//        int bPrice=triDruga.getBuyingPrice();
//        int yr=triDruga.getYearOfIssue();
//
//        System.out.println(bookName+", "+bookAuthor+", "+bPrice+", "+yr);
    }
}
