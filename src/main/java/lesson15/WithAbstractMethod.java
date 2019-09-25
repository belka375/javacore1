package lesson15;

public abstract class WithAbstractMethod {
    private int number;

    public WithAbstractMethod(int number) {
        this.number = number;
    }

    public abstract void spillTheWater(double y);
}
