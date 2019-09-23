package workHw14;

public class Dog extends Animals {
    public String dogBreed;
    public String ownerName;

    public Dog (String animalName, int legs, double heartBeat,String breed,String ownername ){

        super(animalName,legs,heartBeat);
        this.dogBreed =breed;
        this.ownerName = ownername;
    }


       public String getDogBreed() {
       return dogBreed;
    }

    public String getOwnerName() {
        return ownerName;
    }
}

