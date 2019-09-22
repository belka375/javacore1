package hw10;

public class Work {
    public static void main(String[] args) {

        Theatre smiths = new Theatre();

        smiths.setType("WorldClass");
        smiths.setPerformers("famous");
        smiths.setStage("big");
        smiths.setSeats(300);

        String theatreType = smiths.getName();
        String theatrePerformers = smiths.getPerformers();
        String theatreStage = smiths.getStage();
        int theatreSeats = smiths.getSeats();

        smiths.printTheatreInfo();


        Sauna sauna = new Sauna();

        sauna.setBench("wooden");
        sauna.setDoor(1);
        sauna.setSteam("dry");
        sauna.setTemperature(117.6);

        String sB = sauna.getBench();
        int dR = sauna.getDoor();
        String sM = sauna.getSteam();
        double temp = sauna.getTemperature();

        sauna.printSaunaAttributes();


        Gym gym = new Gym();
        int inPool = 1;
        String[] machine = new String[]{"Stair master", "treadmill", "pull machine"};
        String trainer = "Trainers";
        Boolean kiddo = true;

        gym.setIndoorPool(1);
        gym.setMachines(new String[]{"Stair master", "treadmill", "pull machine"});
        gym.setTrainer("Trainers");
        gym.isKidsClub();

        gym.printGymInfo();

        if (kiddo == true) {
            System.out.println("Yes gym has kidsClub");
        }
        //for (String machines : gym.getMachines()) {
        //    System.out.println(machine);
    }
    }




