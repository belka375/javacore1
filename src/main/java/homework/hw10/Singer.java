package homework.hw10;

public class Singer {
    private String name;
    public boolean activeNow;
    private String country;
    private String[] genres;


    public Singer(String name,boolean act,String co,String[] gen){
        this.name=name;
        this.activeNow=act;
        this.country=co;
        this.genres=gen;
    }

    public Singer(){}

    public void setName(String n){
        this.name=n;}
    public void setActiveNow(boolean act){
        this.activeNow=act;
               }
    public void setCountry(String co){
        this.country=co;}
    public void setGenres(String[] gen){
        this.genres=gen;}

    public String getName(){
    return name;
    }
    public boolean getActiveNow(){
    return activeNow;
    }
    public String getCountry(){
    return country;
    }
    public String[] getGenres(){
    return genres;
    }

    public void printClassSinger() {
        System.out.println("           ");
        System.out.print(name + ", "+country+", ");
          if(activeNow=true){
            System.out.print("active"+"\ngenres: ");
            }else{
              System.out.print("retired"+"\ngenres: ");
          }
        for (String gen : genres) {
            System.out.print("  "+gen);
        }
        System.out.println("    ");
    }

}
