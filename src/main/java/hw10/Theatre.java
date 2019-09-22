package hw10;

public class Theatre {
    private String type;
    private String stage;
    private String performers;
    private int seats;

    public void setStage(String big) {
        stage = big;
    }

    public void setPerformers(String f) {
        performers = f;
    }

    public void setType(String t){
        type  = t;
    }
    public void setSeats(int s){
        s = 350;
    }
    public String getName(){
        return type ;
    }
    public String getPerformers(){
        return performers;
    }
    public String getStage(){
        return stage;
    }
    public int getSeats(){
        return seats;
    }

    public void printTheatreInfo() {
        System.out.println( "Theatre: "+type+", "+performers+", "+stage+", "+seats+".");
    }

    public Theatre() {

    }

    public Theatre(String theatreType, String theatrePerformers, String theatreStage, int theatreSeats){
        this.type = theatreType;
        this.performers = theatrePerformers;
        this.stage = theatreStage;
        this.seats =theatreSeats;
    }
    }



