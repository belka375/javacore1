package hw15;

public class Work {
    public static void main(String[] args){
        HomeAppliance myRef = new Refrigirator("Electrolux", 3000.00);
        HomeAppliance yourRef = new Refrigirator("Ariston", 3500.00);
        HomeAppliance myvc = new VacuumCleaner(200, "Bosh");
        HomeAppliance yourVc = new VacuumCleaner(400, "Dayson");

        printInfos(myRef);
        System.out.println("****************");
        printInfos(yourRef);
        System.out.println("****************");
        printInfos(myvc);
        System.out.println("****************");
        printInfos(yourVc);


    }
    public static void printInfos(HomeAppliance hh){
        hh.printInfo();
    }
}
