package HW8;

public class Work {
    public static void main(String[] args) {

        Hobby myHobby = new Hobby();
        myHobby.Friday= "piano";
        myHobby.Saturday= "soccer";
        myHobby.Sunday= "sleep";
        myHobby.Schedule();

        System.out.println("*****************");

        WorkPlace myWorkplace=new WorkPlace();
        myWorkplace.table="wide table";
        myWorkplace.chair="comfy chair";
        myWorkplace.laptop="Macbook Pro";
        myWorkplace.stuff();

        System.out.println("*****************");

        Vacation johnVacation = new Vacation();
        johnVacation.Country= "USA";
        johnVacation.City= "LA";
        johnVacation.State= "California";
        johnVacation.visit();
    }
}
