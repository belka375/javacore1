package homework15;

import java.util.Arrays;

public class RobotHuman implements Robot {
         private int price;
    private String[] motions;
    private boolean speak;

    public RobotHuman(int price, String[] motions,boolean speak ) {
        this.price = price;
        this.motions = motions;
        this.speak = speak;

    }

    @Override
    public int salesPrice() {
        return price*5;
    }

    @Override
    public void motion() {
        System.out.println(motions);
    }

    @Override
    public void ableToSpeak() {
        if (speak == false) {
            System.out.println("not able to speak");
        } else {
            System.out.println("able to speak");
        }

    }

    @Override
    public void printInfo() {
        System.out.println("Robot Dog Price: "+salesPrice()+" Motions "+ Arrays.toString(motions));
        ableToSpeak();

    }
    }
