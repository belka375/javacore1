package workHw15;

abstract class Vehicle implements Moveable {
   private String color;
   private String model;

    public void move() {
        System.out.println("Average speed is: " + speed);
    }

    public Vehicle(String color, String model) {
        this.color = color;
        this.model = model;

    }


}





