package workHw14;

public class Tiger extends Animals {

    private String type;
    private int age;
    private int speedHourly;


    public Tiger (String animalName, int legs, double heartBeat,String type,int age,int hourlySpeed){

        super (animalName, legs, heartBeat);
        this.age = age;
        this. speedHourly = hourlySpeed;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public int getSpeed() {
        return speedHourly;
    }
}

