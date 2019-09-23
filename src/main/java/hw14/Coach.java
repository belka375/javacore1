package hw14;

import java.time.LocalDateTime;

public class Coach extends FootballTeam{
    private int yearsOfExperience;
    private  String title;

    public Coach(String club, String name,String title, LocalDateTime dob,int yearsOfExperience) {
        super(club, name, dob);
        this.yearsOfExperience=yearsOfExperience;
        this.title=title;
    }
    public void printCoach(){
        System.out.println(club+","+"Name:"+name+","+title+"."+"DOB:"+dob+"."+"\nYears of experience:"+yearsOfExperience);
    }
}
