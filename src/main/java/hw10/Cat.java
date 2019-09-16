package hw10;

public class Cat {
    private String bride;
    private String name;
    private String[] food;

    public Cat(){

    }
    public Cat(String bride, String name, String[]food){
        this.bride=bride;
        this.name=name;
        this.food=food;

    }

    public void printCatInfo(){
        System.out.println(bride+" "+name);
        for (String fd:food){
            System.out.println(fd+" ");
        }
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setBride(String bride) {
        this.bride = bride;
    }

    public void setFood(String[] food) {
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public String getBride() {
        return bride;
    }

    public String[] getFood() {
        return food;
    }
}
