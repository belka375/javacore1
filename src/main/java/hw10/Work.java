package hw10;

public class Work {
    public static void main(String[]args){


        //Class Dog
        String[] immunization = new String[]{"Distemper", "DHPP","Rabies", "DHPP2"};

        Dog rex= new Dog("Rex", "German Sheppard", 24, immunization);

        Dog tom=new Dog();
        tom.setName("Tom");
        tom.setBreed("Terrier");
        tom.setAge(12);
        tom.setImmunization(immunization);

        rex.printDogInfo();
        tom.printDogInfo();

        System.out.println("\n_______________________");

        //Class Kino
        String[] actors=new String[]{"Roy Scheider", "Robert Shaw", "Richard Dreyfuss"};

        Kino jaws=new Kino("Jaws", "Steven Spielberg", 1975, "Thriller", actors);
        jaws.printKinoInfo();
        System.out.println("\n_______________________");


        String[]actors2=new String[]{"Nadezhda Rumyantseva", "Nikolai Rybnikov", "Lyusyena Ovchinnikova"};

        Kino devchata=new  Kino();
        devchata.setName("Devchata");
        devchata.setDirector("Yuri  Chulyukin");
        devchata.setYear(1961);
        devchata.setGenre("Comedy");
        devchata.setActors(actors2);

        devchata.printKinoInfo();
        System.out.println("\n_______________________");

        //class  Stroller
        String[]  accessories =new  String[]{"Rain shield",  "Bug shield", "Bumper bar"};

        Stroller uppababyCruz=new Stroller();
        uppababyCruz.setBrand("Uppababy");
        uppababyCruz.setModel("Cruz");
        uppababyCruz.setYear(2019);
        uppababyCruz.setWeight(15.5);
        uppababyCruz.setAccesoriesIncluded(accessories);
        uppababyCruz.setForNewborn(false);

        uppababyCruz.printStrollerInfo();
        System.out.println("\n_______________________");

        String[] accessories2=new String[]{"Rain shield",  "Bug shield", "Head holder","Foot cover","Full  recliner"};
        Stroller  macTechno=new Stroller("Maclaren", "Techno XT", 2019, 12.2, accessories2,  true);
        macTechno.printStrollerInfo();









    }
}
