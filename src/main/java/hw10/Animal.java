package hw10;

public class Animal {
    private String animalName;
    private String group;
    private String[] whatEats;
    private int cubsOrEggsNumber;
    private String blood;

    public Animal(){}
    public Animal(String animalName, String group, String[] whatEats, int cubsOrEggsNumber, String blood){
        this.animalName=animalName;
        this.group=group;
        this.whatEats=whatEats;
        this.cubsOrEggsNumber=cubsOrEggsNumber;
        this.blood=blood;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setWhatEats(String[] whatEats) {
        this.whatEats = whatEats;
    }

    public void setCubsOrEggsNumber(int cubsNumber) {
        this.cubsOrEggsNumber = cubsNumber;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getAnimalName() {
        return animalName;
    }
    public String getGroup() {
        return group;
    }

    public String[] getWhatEats() {
        return whatEats;
    }

    public int cubsOrEggsNumber() {
        return cubsOrEggsNumber;
    }

    public String getBlood() {
        return blood;
    }
    public void printAnimalDescription(){
        System.out.println("\n*******************************");
        System.out.print(animalName+" is from group: "+group+" and "+blood+"\ncan have eggs or cubs: "+cubsOrEggsNumber+" and eat");
        for (String eat:whatEats) {
            System.out.print(" "+eat+", ");
        }
    }
}
