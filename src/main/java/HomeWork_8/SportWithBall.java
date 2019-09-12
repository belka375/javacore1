package HomeWork_8;

public class SportWithBall {
    public String sporName;
    public int ballSize;
    public int playersQty;
    public String mostPopularInCountry;
    public String starNumberOne;

    public void details() {
        System.out.println("Sport - " + sporName + "\nMost popular in - " + mostPopularInCountry + "\nBiggest star - " + starNumberOne);
    }

    public void characteristics() {
        System.out.println("Sport - " + sporName + "\nBall size - " + ballSize + "\nQuantity of players on the field in one team - " + playersQty);
    }
}
