package homeWork_15;

public class BasketballTeam extends Team {
    private String mainStar;
    private String league;

    public BasketballTeam(String teamName, String city, String homeArena, String mainStar, String league) {
        super(teamName, city, homeArena);
        this.mainStar = mainStar;
        this.league = league;
    }

    public void setMainStar(String mainStar) {
        this.mainStar = mainStar;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getMainStar() {
        return mainStar;
    }

    public String getLeague() {
        return league;
    }

    public void printTeamInfo() {
        System.out.println("Team name: " + teamName + "\nCity: " + city + "\nHome arena: " + homeArena + "\nMain star player: " + mainStar + "\nLeague: " + league);
    }
}
