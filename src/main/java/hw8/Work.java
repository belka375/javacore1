package hw8;

public class Work {
    public static void main(String[] args) {

        Hobby myHobby = new Hobby();
        myHobby.friday= "piano";
        myHobby.saturday= "soccer";
        myHobby.sunday= "sleep";
        myHobby.schedule();

        System.out.println("*****************");

        WorkPlace myWorkplace=new WorkPlace();
        myWorkplace.table="wide table";
        myWorkplace.chair="comfy chair";
        myWorkplace.laptop="Macbook Pro";
        myWorkplace.stuff();

        System.out.println("*****************");

        Vacation johnVacation = new Vacation();
        johnVacation.country= "USA";
        johnVacation.city= "LA";
        johnVacation.state= "California";
        johnVacation.visit();
    }
}
