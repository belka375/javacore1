package homework11;

public class Theaters {
    private String name;
    private String address;
    private int totalCapacity;
    private String[] typesOfScreen;
    private Movies[] moviesShowing;
    private MovieRating[] ratingsShowing;
    private Movies movies;

    public Theaters(String name, String address, int totalCapacity, String[] typesOfScreen, Movies[] moviesShowing, MovieRating[] ratingsShowing){
        this.name = name;
        this.address = address;
        this.totalCapacity = totalCapacity;
        this.typesOfScreen = typesOfScreen;
        this.moviesShowing = moviesShowing;
        this.ratingsShowing = ratingsShowing;
//        for (Movies m: moviesShowing){
//            int i = 0;
//            for (MovieRating mr : ratingsShowing){
//                if (m.getRating()==mr){
//                    this.moviesShowing[i] = m;
//                    i++;
//                    break;
//                }
//            }
//        }
    }
    public void printTheaterDetails(){

        System.out.println("Name: "+name+"\nAddress: "+address+"\nCapacity: "+totalCapacity);
        System.out.println("Screens: ");
        for (String sc : typesOfScreen){
            System.out.print(sc+"; ");
        }
        System.out.println();
        System.out.println("Ratings showing: ");
        for (MovieRating mr: ratingsShowing){
            System.out.print(mr+"; ");
        }
        System.out.println();
    }

    public MovieRating tr(MovieRating[] ratingsShowing){
        MovieRating thr = MovieRating.R;
        for (MovieRating rt: ratingsShowing){
            thr.equals(rt);
        }
        return thr;
    }

    public void showing(){
        for (Movies mv : moviesShowing){
            mv.printMovieDetails();
            System.out.println();
            }

        }

    }



