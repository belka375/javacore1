package hw14;

import java.time.LocalDateTime;

public class FootballTeam {
    protected String name;
    protected LocalDateTime dob;
    protected String club;
    public FootballTeam(String club,String name,LocalDateTime dob){
        this.club=club;
        this.name=name;
        this.dob=dob;
    }
    public void setClub(String club) {
        this.club = club;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }
    public String getClub() {
        return club;
    }
    public String getName() {
        return name;
    }
    public LocalDateTime getDob() {
        return dob;
    }
    protected void printFootballTeam(){
        System.out.println("Club:"+club+" "+"Name:"+name+" "+"Date of birth:"+dob);
    }
}
