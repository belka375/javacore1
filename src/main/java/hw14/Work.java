package hw14;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Work {
    public static void main(String[] args) {
    Player lionel=new Player("FC Barcelona","Lionel Messi", LocalDateTime.of(1987,06,24,12,12,12),"Forward","FIFA World Player of the Year 2009/European Golden Shoe",600);
    Coach alex=new Coach("Manchester Unated","Alexander Ferguson","Coach",LocalDateTime.of(1941,12,31,11,11,11),27);
    Goalkeeper david=new Goalkeeper("Manchester Unated","David de Gea",LocalDateTime.of(1990,11,7,10,10,10),"Goalkeeper","English FA Cup winner");
    Goalkeeper manuel=new Goalkeeper("FC Bayern Munich","Manuel Neuer",LocalDateTime.of(1986,3,27,10,11,12),"Goalkeeper","FIFA FIFPro World XI");
    manuel.printGoalkeeper();
    alex.printCoach();
    lionel.printPlayer();
    }
}
