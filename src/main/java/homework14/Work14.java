package homework14;

public class Work14 {
    public static void main(String[] args) {
        Company freshProduce = new Company("Fresh Produce","2040 Ortega street","Orlando", "FL", 23456 ,"John Rockfeller" );
        Document Invoice = new Document (DocumentType.INVOICE, freshProduce, (new String[]{"Tomato", "Potato", "Strawberry"}), 2500,"2040 Ortega","Orlando", "FL", 23456);

        String payee = Invoice.getCompany().getPayee();
        Invoice.printDocument();

    }
}
