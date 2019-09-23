package hw11;

public class Yoga {
   private Days day;
   private YogaClasses[] yogaclass;

   public Yoga(Days dayY, YogaClasses[] yogaC) {
       this.day = dayY;
       this.yogaclass = yogaC;
   }

    public Days getDay() {
       return day;
    }

    public YogaClasses[] getYogaclass() {
       return yogaclass;
    }

    public void printYogaClassesInfo () {
       System.out.println( "\nSchedule for " + day + ": ");
       for (YogaClasses yogaC:yogaclass ) {
           System.out.print( yogaC + "\n" );
       }
    }
}
