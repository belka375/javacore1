package hwAdd;

public class Wild extends Animals{
    private Food food;
    private String wolf;

    public Wild(String color, String location, Food food, String wolf){
        super(color,location);
        this.food=food;
        this.wolf=wolf;

    }
    public void printWolfie(){
        printAnimals();
        System.out.println(wolf);
        System.out.println(food);
    }
}
