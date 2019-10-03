package homeworkFarm;

import java.util.ArrayList;
import java.util.HashMap;

public class HomeWork {
    public static void main(String[] args) {
        Address adr1 = new Address("100 Green St", "Louisville", "KY", 40204);
        Address adr2 = new Address("200 Red St", "Richmond", "KY", 40204);
        Address adr3 = new Address("32 Yellow St", "Chicago", "IL", 54234);

        HashMap<Cattle, Integer> cat1 = new HashMap<>();
        cat1.put(Cattle.CHICKENS, 45);
        cat1.put(Cattle.COWS, 150);
        cat1.put(Cattle.SHEEP, 90);
        cat1.put(Cattle.TURKEYS, 20);

        HashMap<Cattle, Integer> cat2 = new HashMap<>();
        cat1.put(Cattle.CHICKENS, 10);
        cat1.put(Cattle.COWS, 2);
        cat1.put(Cattle.SHEEP, 15);
        cat1.put(Cattle.TURKEYS, 10);

        HashMap<Cattle, Integer> cat3 = new HashMap<>();
        cat1.put(Cattle.CHICKENS, 12456);
        cat1.put(Cattle.TURKEYS, 3457);

        AgreeCultural agr1 = new AgreeCultural("Rye", 54);
        AgreeCultural agr2 = new AgreeCultural("Carrots", 40);
        AgreeCultural agr3 = new AgreeCultural("Radishes", 90);
        AgreeCultural agr4 = new AgreeCultural("Cucumbers", 23);
        AgreeCultural agr5 = new AgreeCultural("Tomatoes", 50);
        AgreeCultural agr6 = new AgreeCultural("Grain", 48);

        ArrayList<AgreeCultural> agreeCulturals1 = new ArrayList<>();
        agreeCulturals1.add(agr1);
        agreeCulturals1.add(agr2);
        agreeCulturals1.add(agr3);
        agreeCulturals1.add(agr4);
        agreeCulturals1.add(agr5);
        agreeCulturals1.add(agr6);

        ArrayList<AgreeCultural> agreeCulturals2 = new ArrayList<>();
        agreeCulturals2.add(agr1);
        agreeCulturals2.add(agr2);
        agreeCulturals2.add(agr3);
        agreeCulturals2.add(agr4);


        ArrayList<AgreeCultural> agreeCulturals3 = new ArrayList<>();
        agreeCulturals3.add(agr1);
        agreeCulturals3.add(agr4);
        agreeCulturals3.add(agr5);
        agreeCulturals3.add(agr6);

        Farm farm1 = new Farm("HappyMilker", adr1, cat1, agreeCulturals1);
        Farm farm2 = new Farm("NewFarm", adr2, cat2, agreeCulturals2);
        Farm farm3 = new Farm("SuperPoultry", adr3, cat3, agreeCulturals3);

        ArrayList<Farm> allFarms = new ArrayList<>();
        allFarms.add(farm1);
        allFarms.add(farm2);
        allFarms.add(farm3);

        allFarms.forEach(farm -> {
            farm.PrintInfo();
            System.out.println();
        });




    }
}
