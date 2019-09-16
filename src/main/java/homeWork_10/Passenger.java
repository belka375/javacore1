package homeWork_10;

public class Passenger {
    private String name;
    private int age;
    private String destination;
    private String[] baggage;


    //==============default constructor=======================
    public Passenger() {
    }

    //===============constructor==========================
    public Passenger(String name, int age, String destination, String[] baggage) {
        this.age = age;
        this.name = name;
        this.destination = destination;
        this.baggage = baggage;
    }

    //===============setter=======================================
    public void setAge(int age) {
        this.age = age;
    }

    public void setBaggage(String[] baggage) {
        this.baggage = baggage;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setName(String name) {
        this.name = name;
    }

    //==========================getter==========================
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDestination() {
        return destination;
    }

    public String[] getBaggage() {
        return baggage;
    }

    public void printMyMama() {
        System.out.println("My mama is " + name + ";\nShe is " +
                age + " years old; \nShe leave in  " + destination + " ");
        for (String bag : baggage) {
            System.out.println("She has a baggage " + bag + " ");

        }
    }
}
