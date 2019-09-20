package homework.hw10;


    public class Artist {

    private String name;
    private String country;
    private int yearOfBirth;
    private String[] genres;

    public Artist(String name, String co, int yob, String[] gen) {
            this.name = name;
            this.country = co;
            this.yearOfBirth = yob;
            this.genres = gen;
    }

    public Artist(){}

    public void setName(String na) {
        this.name = na;
    }

    public void setCountry(String co) {
        this.country = co;
    }

    public void setYearOfBirth(int yob) {
        this.yearOfBirth = yob;
    }

    public void setGenres(String[] genre) {
        this.genres = genre;
    }


        public String getName() {
            return name;
        }

        public String getCountry() {
            return country;
        }

        public int getYearOfBirth() {
            return yearOfBirth;
        }

        public String[] getGenres() {
            return genres;
        }



    public void printClassArtist() {
        System.out.println("     ");
        System.out.print(name + ", " + country+",  "+yearOfBirth+"\ngenres: ");
        for (String gen : genres) {
            System.out.print("  "+gen);
        }
        System.out.println("    ");
    }
}


