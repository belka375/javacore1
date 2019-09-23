package homework14;

import java.util.Arrays;

public class Document extends Address {

    private DocumentType documentType;
    private Company company;
    private String[] items;
    private int total;

    public Document (DocumentType documentType, Company company, String[] items, int total, String street, String city, String state, int zip){
        super(street, city, state, zip);
        this.documentType = documentType;
        this.company = company;
        this.items = items;
        this.total = total;
    }
    public void printDocument(){
        company.printCompany();
        System.out.print(documentType+"\n "+Arrays.asList(items)+"\n"+"Total amount: "+total);

    }

    public Company getCompany() {
        return company;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }


}
