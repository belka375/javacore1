package Homework10;

/*
 * Homework 10.1-  top casinos in UK
 * Сделать 3 класса - в каждом классе по краней мере 3 атрибута.
 *Каждый аттрибут имеет setter и getter
 *Каждый класс имеет по краней мере 2 конструктора - default и полный (можно больше конструкторов)
 *создайте в каждом классе метод printClass() - для вывода всех полей на экран
 *По крайней мере один атрибут в одном классе должен быть array
 *Создайте в классе Work / main() по крайней мере 2 объекта каждого класса - один полным конструктором, один дефолтовым. Объект созданный дефолтовым конструктором заполните при помощи сеттеров
 *Выведите на экран эти объекты функцией printClass()
 */

public class Casino {

    private String name;
    private int rating;
    private String[] games;

    public Casino() {

    }

    public Casino(String name){
        this.name = name;
    }

    public Casino (String name, int rating, String[] games){
        this.games = games;
        this.rating = rating;
        this.name = name;
    }

    public void printClass(){

        System.out.println( name + ", " + rating + ", [" + getGamesText() + "]");
    }



    public String getGamesText(){
        String gamesList = "";

        for (int i = 0; i<games.length; i++ ){
            gamesList += games[i];

            if (i != games.length - 1) {
                gamesList += ", ";
            }
        }

        return gamesList;
    }

    //setters and getters

    public void setName (String name){
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    public void setRating (int rating){
        this.rating = rating;
    }

    public int getRating(){
        return this.rating;
    }

    public void setGames(String[] games) {
        this.games = games;
    }


    }








