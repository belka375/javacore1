package samplesOfHv.tanik14;

public class Work14 {

        public static void main(String[] args) {

            // Parent class PlaceForRent
            // Children: Townhouse and Condo
            // Enums: PlaceType and Appliances
            // Print into from class ApartmentComplex

            Appliances allAppliances[]=new Appliances[]{Appliances.REFRIGERATOR, Appliances.DISHWASHER, Appliances.WASHER, Appliances.DRYER};
            Appliances noStirka[]=new Appliances[]{Appliances.REFRIGERATOR, Appliances.DISHWASHER};

            Townhouse townhouse1=new Townhouse("TH1",true, 2, 3, noStirka, 2, true );
            Townhouse townhouse2=new Townhouse("TH2", false, 3,3, allAppliances, 2, false);
            Townhouse townhouse3=new Townhouse("TH3", true, 2, 2, allAppliances, 2, false);
            Townhouse townhouse4=new Townhouse("TH4", true, 2, 2, allAppliances, 2, true);

            Condo condo1=new Condo("C1", true, 2, 2, noStirka, 3);
            Condo condo2=new Condo( "C2", false, 2, 1, allAppliances,2);
            Condo condo3=new Condo( "C3", true, 2,2, noStirka, 1);
            Condo condo4=new Condo ("C4", false, 2,1, allAppliances,2);

            Townhouse[] listTownhouse1=new Townhouse[]{townhouse1, townhouse3};
            Townhouse[] listTownhouse2=new Townhouse[]{townhouse2,townhouse4};
            Condo[] listCondo1=new Condo[] {condo1,condo2};
            Condo[] listCondo2=new Condo[] {condo3, condo4};


            ApartmentComplex complex1=new ApartmentComplex("Romashka", listTownhouse1, listCondo1 );
            ApartmentComplex complex2=new ApartmentComplex("Rediska", listTownhouse2, listCondo2);

            System.out.println("***Complex 1****");
            complex1.printAppartmentInfo();

            System.out.println("\n***Complex 2****");
            complex2.printAppartmentInfo();
        }

    }
