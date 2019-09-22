package hw14.nested;

public class OwnerName {
    private String ownerName;

    public OwnerName(String fullName){
        this.ownerName=fullName;
    }

    public String getFullName() {
        return ownerName;
    }

    public void setFullName(String fullName) {
        this.ownerName = fullName;
    }
}
