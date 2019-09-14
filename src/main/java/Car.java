public class Car {
    public String color;
    public String model;
    public String brand;
    public double gasTankVolume;

    public void beep(){System.out.println("beep");}

    public void drive(){
        System.out.println("driving");
    }

    public void lightOn(){
        System.out.println("Light turned on");
    }

    public void printCarInfo(){
        System.out.println("Model = "+model+"; Brand="+brand+"; Color="+color+"; Gas Tank Volume="+gasTankVolume);
    }
}
