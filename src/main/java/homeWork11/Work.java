package homeWork11;

public class Work {
    public static void main(String[] args) {

       Relative aibek = new Relative(Sons.AIBEK, 21, "Swimming");
       Relative bika = new Relative(Sons.BIKA, 18, "Boxing");
       Relative iman = new Relative(Sons.IMAN, 11, "Dancing");
               iman.setAge(12);
               iman.setSport("Swimming");
               aibek.setSport("Hiking");

        aibek.printSons();
        System.out.println("=========================");
        
        bika.printSons();
        System.out.println("=========================");

        iman.printSons();
        System.out.println("=========================");


    }
}
