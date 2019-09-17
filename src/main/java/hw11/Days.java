package hw11;

public class Days {
   public static void main(String[]args){
       Months mon1=Months.JAN;
       Months mon2=Months.FEB;
       Months mon3=Months.MAR;
       Months mon4=Months.APR;
       Months mon5=Months.MAY;
       Months mon6=Months.JUN;
       Months mon7=Months.JUL;
       Months mon8=Months.AUG;
       Months mon9=Months.SEP;
       Months mon10=Months.OCT;
       Months mon11=Months.NOV;
       Months mon12=Months.DEC;
       printMonth(Months.JAN);
       printMonth(mon12);
       printMonth(mon9);
   }
   public static void printMonth(Months JAN){
       System.out.println(JAN);
   }
}
