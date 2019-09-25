package homeWork_15;

public class Team implements ProtoTeam {
    protected String teamName;
    protected String city;
    protected String homeArena;

    public Team(String teamName, String city, String homeArena) {
        this.teamName = teamName;
        this.city = city;
        this.homeArena = homeArena;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setHomeArena(String homeArena) {
        this.homeArena = homeArena;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getCity() {
        return city;
    }

    public String getHomeArena() {
        return homeArena;
    }

    public void printTeamInfo() {
        System.out.println("Team name: " + teamName + "\nCity: " + city + "\nHome arena: " + homeArena);
    }
}
