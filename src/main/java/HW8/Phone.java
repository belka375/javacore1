package HW8;

public class Phone {
    public String brand;
    public String color;
    public String operatingsystem;
    public int[] screendimetion;
    public boolean tochscreen;

    public void ring(){
        System.out.println("B-z-z-z-z-z-z-z-z-z-z-z");
    }
    public void displeynumber(long number){
        if (number==0){
            System.out.println("Number cannot be identified");
        }else {
            System.out.println("Сaller number "+number);
        }
    }



}
