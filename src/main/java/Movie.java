public class Movie {

    private String name;
    private int year;
    private String[] actors;

    public void setName(String n) {
        this.name = n;
    }

    public void setYear(int y) {
        this.year=y;
    }

    public void setActors(String[] a){
        this.actors=a;
    }

    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public String[] getActors(){
        return actors;
    }

    public void printMovieInfo(){
        System.out.print("Title: "+name+";\nYear came out: "+year+
                ";\nMain actors: ");
        for (String actor:actors){
            System.out.print(actor+" ");
        }

       }

    public Movie(String name, int year, String[] actors){
        this.name=name;
        this.year=year;
        this.actors=actors;
    }

    public Movie(){
            }
}
