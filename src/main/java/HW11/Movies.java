package HW11;

public class Movies {
    private String name;
    private String director;
    private int year;
    private String[] cast;
    private MovieGenre genre;
    private MovieRating rating;

    public Movies(String name, String director, int year, String[] cast, MovieRating rating, MovieGenre ganre){
        this.name = name;
        this.director = director;
        this.year = year;
        this.cast = cast;
        this.genre = ganre;
        this.rating = rating;
    }
    public void printMovieDetails(){
        System.out.println("Title: "+name+"\nDirector: "+director+"\nYear: "+year+"\nGanre: "+ genre +"\nRating: "+rating);
        System.out.println("Starring: ");
        for (String cst : cast){
            System.out.print(cst+"; ");
        }
        System.out.println();

    };
    public MovieRating getRating(){return rating;}

}
