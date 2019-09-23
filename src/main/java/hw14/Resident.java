package hw14;

public class Resident extends Person {

    private String idNumber;
    private int ssn;

    public Resident (String firstName, String lastName, String id, int ssn) {
        super(firstName, lastName);
        this.idNumber = id;
        this.ssn = ssn;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getSsn() {
        return ssn;
    }
}
