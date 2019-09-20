package hW11;

public class Work {
    public static void main(String[] args){
        Bike myBike=new Bike(WheelsNumber.ONE, "black", "new", "cirkBike", false);
        myBike.printBikeInfo();
        System.out.println("*****************");
        DayOfWeek[] dw1=new DayOfWeek[]{DayOfWeek.MON, DayOfWeek.TUE,DayOfWeek.WED, DayOfWeek.THU, DayOfWeek.FRI,DayOfWeek.SAT, DayOfWeek.SUN};

        Grossery l1=new Grossery(dw1, "Susy");
        l1.printListOfGrossery();

    }
}
