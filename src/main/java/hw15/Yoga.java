package hw15;

public class Yoga implements Activity{
    private String name;
    private int numberOfExercises;

    public Yoga (String name, int numberOfExercises) {
        this.name = name;
        this.numberOfExercises = numberOfExercises;
    }

    @Override
    public int countHours() {
        return numberOfExercises*2;
    }

    @Override
    public void printActivity() {
    System.out.println("My activity is " + name);
    }
}
