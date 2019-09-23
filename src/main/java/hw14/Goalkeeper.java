package hw14;

import java.time.LocalDateTime;

public class Goalkeeper extends FootballTeam{
    private String bestGoalkeeper;
    private String playerPosition;

    public Goalkeeper(String club, String name, LocalDateTime dob,String playerPosition,String bestGoalkeeper) {
        super(club, name, dob);
        this.bestGoalkeeper=bestGoalkeeper;
        this.playerPosition=playerPosition;
    }
    public void printGoalkeeper(){
        System.out.println("Club:"+club+","+"Name:"+name+","+playerPosition+"."+"\nDOB:"+dob+","+"Best goalkeeper award:"+bestGoalkeeper+".");
    }
}
