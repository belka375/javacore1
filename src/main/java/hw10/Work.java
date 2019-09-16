package hw10;

public class Work {
    public static void main(String[] args) {
        String[]streets=new String[]{"Lomonosova,","Mendeleeva,","Mkr.Tretiy,","Sadovaya,","Mayakovskogo."};

        City gorod=new City();
        gorod.setState("Best");
        gorod.setCity("Ever");
        gorod.setZipCode(75757575);
        gorod.setStreets(streets);
        gorod.printCityInfo();


        Plane plane=new Plane();
        plane.setPlane("\nBoeng");
        plane.setColor("Orange");
        plane.setSize("\nVery big one plane");
        plane.setDoors(11);
        plane.setSeats(289);
        plane.setFuelTankVolume(342.8);
        plane.printPlaneInfo();

    }
}
