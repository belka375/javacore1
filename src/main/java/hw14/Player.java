package hw14;

import java.time.LocalDateTime;

public class Player extends FootballTeam {
    private int totalGoals;
    private String awards;
    private String playerPosition;

    public Player(String club, String name, LocalDateTime dob,String playerPosition,String awards,int totalGoals) {
        super(club, name, dob);
        this.awards=awards;
        this.playerPosition=playerPosition;
        this.totalGoals=totalGoals;
    }
    public  void  printPlayer(){
        System.out.println("Club:"+club+","+"Name:"+name+","+playerPosition+"."+"\n"+"DOB:"+dob+"."+"\nAwards:"+awards+"."+"\nTotal goals:"+totalGoals);
    }
}
