package homework.hw10;

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isFilmed;
    private int[] yearsOfFilms;

    public Book(String title, String author, int year, boolean isFi, int[] yof) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isFilmed = isFi;
        this.yearsOfFilms = yof;
    }

    public Book() {
    }

    public void setTitle(String title1) {
        this.title = title1;
    }

    public void setAuthor(String author1) {
        this.author = author1;
    }

    public void setYear(int year1) {
        this.year = year1;
    }

    public void setIsFilmed(boolean film) {
        this.isFilmed = film;
    }
    public void setYearsOfFilms(int[] fy) {
        this.yearsOfFilms = fy;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean getIsFilmed() {
        return isFilmed;
    }


    public int[] getYearsOfFilms() {
        return yearsOfFilms;
    }


    public void printClassBook() {
        System.out.println("      ");
        System.out.print(title + ", " + author + ", " + year + ", ");
        if (isFilmed = true) {
            System.out.print("staged" + "\nYears staged: ");
        } else {
            System.out.print("never staged");
        }
        for (int yof : yearsOfFilms) {
            System.out.print("  " + yof);
            }
        System.out.println("    ");
        }

}
