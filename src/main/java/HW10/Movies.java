package HW10;

public class Movies {
    private String name;
    private String director;
    private int year;
    private String[] cast;

    public Movies(String name, String director, int year, String[] cast){
        this.name = name;
        this.director = director;
        this.year = year;
        this.cast = cast;
    }
    public void printMovieDetails(){
        System.out.println("Title: "+name+"\nDirector: "+director+"\nYear: "+year);
        System.out.println("Starring: ");
        for (String cst : cast){
            System.out.print(cst+"; ");
        }
        System.out.println();

    }
}
