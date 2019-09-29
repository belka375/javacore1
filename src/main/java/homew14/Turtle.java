package homew14;

public class Turtle extends Pets {

    public String petName;
    public String ownerName;

    public Turtle(String petName, int paws, double height, String petname, String ownername ){

        super(petName,paws,height);
        this.petName =petname;
        this.ownerName = ownername;
    }


    public String getPetName() {
        return petName;
    }

    public String getOwnerName() {
        return ownerName;
    }


}
