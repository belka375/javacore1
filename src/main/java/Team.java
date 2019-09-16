public class Team {
    private String sport;
    private String division;
    private int[] players;
    private boolean qualified;
    private double rating;


    public Team (String sport, String division, int[] players, boolean qualified, double rating) {
        this.sport = sport;
        this.division = division;
        this.rating = rating;
    }

    public Team () {

    }

    public Team (String sport, String division, double rating) {

    }

    public void setPlayers (int [] players) {
    this.players = players;
    }

    public void setSport (String sport) {
    this.sport = sport;
    }

    public void setDivision (String division) {
    this.division = division;
    }

    public void setQualified (boolean q) {

    }

    public void setRating (double r) {

    }

    public String getSport() {
        return sport;
    }

    public String getDivision() {
        return division;
    }

    public int[] getPlayers() {
        return players;

    }

    public double getRating() {
        return rating;
    }

    public void printTeam () {
System.out.println (sport + " " + division + " " + rating);
        for (int pl: players) {
    System.out.println(pl);
        }
    }





public double estimateRating (double score) {
    return score*0.001;

}



}
