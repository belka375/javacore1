package HW10;

public class Theaters {
    private String name;
    private String address;
    private int totalCapacity;
    private String[] typesOfScreen;
    private Movies[] moviesShowing;

    public Theaters(String name, String address, int totalCapacity, String[] typesOfScreen, Movies[] moviesShowing){
        this.name = name;
        this.address = address;
        this.totalCapacity = totalCapacity;
        this.typesOfScreen = typesOfScreen;
        this.moviesShowing = moviesShowing;
    }
    public void printTheaterDetails(){
        System.out.println("Name: "+name+"\nAddress: "+address+"\nCapacity: "+totalCapacity);
        System.out.println("Screens: ");
        for (String sc : typesOfScreen){
            System.out.print(sc+"; ");
        }
        System.out.println();
    }

    public void showing(){
        for (Movies mv : moviesShowing){
            mv.printMovieDetails();
            System.out.println();
            }

        }

    }



