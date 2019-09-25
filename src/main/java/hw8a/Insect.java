package hw8a;


public class Insect {
    public String name;
    public String order;
    public int lifespan;
    public int legs;


    public void description(){
        System.out.println("Bug description: " +name+", "+order+", average lifespan= "+lifespan+ " months");
    }

    public void crawl() {
        System.out.println("Can crawl");
    }

    public void reproduce() {
        System.out.println("Can be reproduced. Let's hope not on Prod :)");
    }

    public void legs () {
        if (legs == 8) {
            System.out.println("It's a spider");
        } else {
            System.out.println("It's an insect");
        }
    }
    public void fly(){
            System.out.println("Can fly");
        }
    }
