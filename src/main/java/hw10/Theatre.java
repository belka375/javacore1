package hw10;

public class Theatre {
    private String name;
    private String stage;
    private String performers;
    private int seats;

    public void setStage(String big) {
        stage = big;
    }

    public void setPerformers(String f) {
        performers = f;
    }

    public void setName(String n){
        name  = n;
    }
    public void setSeats(int s){
        s = 350;
    }
    public String getName(){
        return name ;
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

    }



