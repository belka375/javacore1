package hw11;

import java.util.Arrays;

public class Work {
public static void main(String[]args){
      Months[]monArray=new Months[]{Months.JAN, Months.FEB, Months.MAR, Months.APR, Months.MAY,
              Months.JUN, Months.JUL, Months.AUG, Months.SEP, Months.OCT, Months.NOV, Months.DEC};

      Months[]winterArray=new Months[]{Months.DEC, Months.JAN, Months.FEB};
      Months[]summerArray=new Months[]{Months.JUN, Months.JUL, Months.AUG};
      Months[]springArray=new Months[]{Months.MAR, Months.APR, Months.MAY};
      Months[]autumnArray=new Months[]{Months.SEP, Months.OCT, Months.NOV};
         printMonths(monArray);
         printWinterMonths(winterArray);
         printSummerMonths(summerArray);
    }
    public static void printMonths(Months []mon){
        for(Months month:mon){
            System.out.print(month+" ");
        }
    }
    public static void printWinterMonths(Months[]win){
    for(Months winter:win){
        System.out.print(winter+" ");
    }
    }
    public static void printSummerMonths(Months[]sum){
    for(Months summer:sum){
        System.out.print(summer+" ");
    }
    }

    }
