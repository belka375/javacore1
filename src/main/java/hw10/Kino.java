package hw10;

public class Kino {
    /*
Сделать 3 класса - в каждом классе по краней мере 3 атрибута.                 !!!
Каждый аттрибут имеет setter и getter                                         !!!
Каждый класс имеет по краней мере 2 конструктора - default и полный          !!!
(можно больше конструкторов)
создайте в каждом классе метод printClass() - для вывода всех полей на экран
По крайней мере один атрибут в одном классе должен быть array               !!!
Создайте в классе Work / main() по крайней мере 2 объекта каждого класса -
 один полным конструктором, один дефолтовым.
 Объект созданный дефолтовым конструктором заполните при помощи сеттеровStr
Выведите на экран эти объекты функцией printClass()
 */

    //Attributes
    private String name;
    private String director;
    private int year;
    private String genre;
    private String[] actors;

    //Constructors full
    public Kino(String name, String director, int year, String genre, String[] actors){
        this.name=name;
        this.director=director;
        this.year=year;
        this.genre=genre;
        this.actors=actors;
    }

    //Constructor default
    public Kino(){}

    //setters
    public void setName(String name) {
        this.name=name;
    }
    public void setDirector(String director){
        this.director=director;
    }
    public void setYear(int  year){

        this.year=year;
    }
    public void setGenre(String genre) {
        this.genre=genre;
    }
    public void setActors(String[] actors){

        this.actors=actors;
    }

    //getters
    public String getName(){
        return name;
    }
    public String getDirector(){
        return director;
    }
    public int getYear(){
        return year;
    }
    public String getGenre(){
        return genre;
    }
    public String[]getActors(){
        return actors;
    }

    //print
    public void printKinoInfo(){

        System.out.print("\n"+name+", "+director+", "+year+"\nGenre: "+genre);
        System.out.print("\nActors: ");
        for (String actor:actors) {
            System.out.print(actor+", ");

        }
    }


}
