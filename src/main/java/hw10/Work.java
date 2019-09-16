package hw10;

public class Work {
    public static void main(String[] args) {

        Plane plane=new Plane();
        plane.setPlane("\nBoeng");
         plane.setColor("Orange");
         plane.setSize("\nVery big one plane");
         plane.setDoors(11);
         plane.setSeats(289);
         plane.setFuelTankVolume(342.8);
         plane.printPlaneInfo();

        String[]crossStreets=new String[]{"Millenium Ave,","SE Walnut,","West Lane."};
        Road street=new Road();
        street.setCrossStreets(crossStreets);
        street.setLength(58.8);
        street.setRoad("Lomonosova");
        street.setSpeedLimit(35);
        street.printRoad();

        String[]vitaminList=new String[]{"Vit A,","Vit B,","Vit C."};
        Vitamins multi=new Vitamins("Winter helth",vitaminList,"Round","30");
        Vitamins multi2=new Vitamins("Summer help",vitaminList,"Oval","90");
        Vitamins multiComplex=new Vitamins("Old People",vitaminList,"Liquid","120");
        Vitamins askorbinka=new Vitamins();
        multi.setVitaminsList(vitaminList);
        multi.setName("\nWinter health");
        multi.setForm("Round");
        multi.setNumberOfCaps(90);
        multi2.setNumberOfCaps(60);
        multi2.setVitaminsList(vitaminList);
        multi2.setForm("Oval");
        multi2.setName("\nHelp");
        multi2.printVitaminsinfo();
        multi.printVitaminsinfo();
    }

}
