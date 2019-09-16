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


        String[] crossStreets = new String[]{"Millenium Ave,","SE Walnut,","West Lane."};
        Road street=new Road();
        street.setCrossStreets(crossStreets);
        street.setLength(58.8);
        street.setRoad("Lomonosova");
        street.setSpeedLimit(35);

        street.printRoad();



    }
}
