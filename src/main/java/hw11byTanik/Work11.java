package hw11byTanik;

public class Work11 {

    public static void main(String[] args) {

    // Class 1 - Books for sale, enum BookCondition

    // Object  book 1, default constructor

    BooksForSale book1=new BooksForSale();

    book1.setBookName("Harry Potter");
    book1.setBookAuthor("Rowling");
    book1.setBookCondition(BookCondition.ACCEPTABLE);

    System.out.println("\nBook 1 info:");
    book1.printBookInfo();

    // Object book 2, full constructor

    BooksForSale book2= new BooksForSale("Karlson","Ivanov", BookCondition.GOOD);

    System.out.println("\nBook 2 info:");

    book2.printBookInfo();

    // Class 2 - Party, enum - Family[]

    // Object party1, default constructor

    Party party1= new Party();

    party1.setHoliday("Halloween");
    party1.setDate("October 30th");
    party1.setAttendees(new Family[] {Family.MOM, Family.DAD, Family.BROTHER, Family.SISTER});

    System.out.println("\nParty 1 Info:");

    party1.printInfoParty();

    // Object party2, full constructor

    Party party2=new Party("Valentine's Day", "February 14th", new Family[]{Family.MOM, Family.DAD});

    System.out.println("\n\nParty 2 Info:");
    party2.printInfoParty();



    }
}
