package hw15;

public class Work {
    public static void main (String[] args) {

        Activity AshtangaYoga = new Yoga ("AshtangaYoga", 42);
      int y =  AshtangaYoga.countHours();
      AshtangaYoga.printActivity();
      System.out.println("The number of hours is " +y);

      System.out.println("-----------------------");

      String[] schedule = new String[] {"Monday", "Wednesday", "Friday"};
      Activity SlowJogging = new Jogging("SlowJogging", schedule, 6);
      int z = SlowJogging.countHours();
      SlowJogging.printActivity();
      System.out.println("The number of hours is " + z);
    }
}
