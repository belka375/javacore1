package hw14byD;

public class Kids extends Parents {

    private String school;

    public Kids(String firstName, String lastName, String school) {
        super(firstName, lastName, school);
        this.school = school;


    }

    public void printKidsInfo() {
        printParentsInfo();



    }
}

