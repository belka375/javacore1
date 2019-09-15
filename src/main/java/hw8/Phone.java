package hw8;

public class Phone {
    public String brand;
    public String model;
    public String os;
    public String color;
    public double screenSize;
    public int cameraNumbers;


    public void ring() {
        System.out.println("Ding-Dong");
    }
    public void message(){
        System.out.println("Hello");
    }
    public void alarm(){
        System.out.println("It's 7 am");
    }

    public void printPhoneInfo(){
        System.out.println("Brand="+brand+"; Model="+model+"; OS="+os+"; Color="+color+"; Screensize="+screenSize+"; Number of Cameras="+cameraNumbers);
    }
}
