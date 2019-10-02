package homeWork10;


public class PrintClass {
    public static void main(String[] args) {

        String[] ingr = new String[]{"milk", "coffee","sugar", "agar"};

        Icecream coffee = new Icecream("coffee", 200.5, ingr, "brown", 12);

        coffee.setPrice(6);
        coffee.setColor("Light brown");

        coffee.printIceCream();
System.out.println("=============================================");
        Icecream creamBrulee = new Icecream();
        creamBrulee.setName("Cream Brulee");
        creamBrulee.setWeight(100.5);
        creamBrulee.setIngredients(ingr);
        creamBrulee.setColor("Milk");
        creamBrulee.setPrice(25);
        creamBrulee.printIceCream();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        String[]baggage = new String[]{"Buggy", "Handbag", "Satchel","Bag"};
        Passenger mama = new Passenger("Lubov", 60, "Almaty", baggage);
        mama.printMyMama();

        System.out.println("==============================================================");

        String[]dist = new String[]{"Medeu", "Karasay", "Kabanbay", "Aksay", "Jetisu"};

        City almaty = new City("Almaty", "Kazakhstan", 1500000, dist);
        almaty.printCity();
        System.out.println("=======================================");
        String[]dist2 = new String[]{"No districts"};
        City hasbrHeights = new City();
        hasbrHeights.setName("Hasbrouck Heights");
        hasbrHeights.setCountry("The USA");
        hasbrHeights.setPopulation(3000);
        hasbrHeights.setDistricts(dist2);
        hasbrHeights.printCity();


        }


    }

