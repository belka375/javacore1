package lesson15;

public abstract class WithAbstractMethod {
    private int number;

    public WithAbstractMethod(int number){
        this.number=number;
    }

    public abstract void slippTheWater(double y);
}
// if class has one abstract method - this class ill be abstract as well,
//we can create one object ofit and cant extended it as well