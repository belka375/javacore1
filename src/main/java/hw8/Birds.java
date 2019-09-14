package hw8;

public class Birds {
    public String color;
    public String type;
    public String name;
    public double age;
    public String food;
    public String birdOwner;

    public void game () {
        System.out.println("Looking into the mirror");}

    public void printBirdsInfo() {
        System.out.println("Type of birds: " + type +"\nOwner: " + birdOwner+ "\nName: "+ name + "\nColor: " + color + "\nAge: " + age +  "\nFavorite food: " + food);}
}
