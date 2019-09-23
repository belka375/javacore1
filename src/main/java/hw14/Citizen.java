package hw14;

public class Citizen extends Resident {

    private String passportNumber;

    public Citizen (String firstName, String lastName, String id, int ssn, String passportNumber) {
        super(firstName, lastName, id, ssn);
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }
}
