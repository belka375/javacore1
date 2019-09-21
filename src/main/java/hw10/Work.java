package hw10;

public class Work {
    public static void main(String [] args) {

        Theatre smiths = new Theatre();

        smiths.setName("Smiths");
        smiths.setPerformers("famous");
        smiths.setStage("big");
        smiths.setSeats(300);

        String theatreName = smiths.getName();
        String theatrePerformers = smiths.getPerformers();
        String theatreStage = smiths.getStage();
        int theatreSeats = smiths.getSeats();

        System.out.println(theatreName + "," + theatrePerformers + "," + theatreStage + "," + theatreSeats);

        Sauna sauna = new Sauna();
        sauna.getBench();
        sauna.getDoor();
        sauna.getSteam();
        sauna.getTemperature();

        String sB = sauna.getBench();
        int dR = sauna.getDoor();
        String sM= sauna.getSteam();
        double temp = sauna.getTemperature();
        sB = "wooden";
        dR = 1;
        sM = "dry";
        temp = 117.6;

        System.out.println( "Sauna: "+sB+", "+dR+", "+sM+","+temp);


        Gym gym = new Gym();
        gym.getIndoorPool();
        gym.getMachines();
        gym.getTrainer();
        gym.isKidsClub();

        int iP = 1;
        String [] m = {"stair master", "treadmill", "spin"};
        String tR = "Rayn";
        boolean kC = true;

        







    }

}
