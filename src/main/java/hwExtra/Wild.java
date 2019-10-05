package hwExtra;

public class Wild extends Animals{
    private Food[] food;
    private String wolf;

    public Wild(String color, String location, Food[] food, String wolf){
        super(color, location);
        this.food=food;
        this.wolf=wolf;
    }
    public void printWolfie(){
        System.out.println(wolf);
        for (Food f:food) {
            System.out.println(f);
        }
    }
}
