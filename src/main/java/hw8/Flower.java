package hw8;

public class Flower {
    public String type;
    public String color;
    public String shape;
    public String height;
    public String smell;



    public void blossom(){
        System.out.println("blossom constantly");
    }

   public void flowerDescription(){

       System.out.println(type+" have "+"\ncolor: "+color+ "\nshape: "+shape+"\nheight: "+height+"\nsmells: "+smell);
   }

}
