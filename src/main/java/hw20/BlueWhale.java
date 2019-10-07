package hw20;

public class BlueWhale extends Whales {
    public void canSwim(){
        System.out.println("Blue Whale can swim!!!!");
    }
    public void canJump(){
        System.out.println("Blue Whale can jump!!!!");
    }

    @Override
    public void haveSkeleton() {
        System.out.println("Blue Whale has skeleton!!!!");
    }

    @Override
    public void haveSkin() {
        System.out.println("Blue Whale has skin!!!!");
    }

    @Override
    public void canBreath() {
        System.out.println("Blue Whale can breath!!!!");
    }
    public void printInfo() {
        System.out.println("************************");
        canSwim();
        canJump();
        haveSkeleton();
        haveSkin();
        canBreath();
    }
}
