package hw8;

public class Dolphin {
    public String type;
    public String color;
    public String length;
    public String weight;

    public void dive(){
        System.out.println("dive into water");
    }
    public void swimFast(){
        System.out.println("swim very fast");
    }
    public void swimSlow(){
        System.out.println("swim but slow");
    }
    public void play(){
        System.out.println("play with each other");
    }
    public void whistle(){
        System.out.println("whistle to calf");
    }
    public void dolphinDescription(){
        System.out.println(type+" dolphins have "+"\ncolor: "+color+ "\nlength: "+length+"\nweight: "+weight);
    }
}
