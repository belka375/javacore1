package hw11;

import java.util.Arrays;

public class Work {
    public static void main(String[] args) {
        Months[] months = new Months[]{Months.JAN, Months.FEB, Months.MAR, Months.APR, Months.MAY,
                Months.JUN, Months.JUL, Months.AUG, Months.SEP, Months.OCT, Months.NOV, Months.DEC};
        Months[] winterMonths = new Months[]{Months.DEC, Months.JAN, Months.FEB};
        Months[] summerMonths = new Months[]{Months.JUN, Months.JUL, Months.AUG};
        Months[] springMonths = new Months[]{Months.MAR, Months.APR, Months.MAY};
        Months[] autumnMonths = new Months[]{Months.SEP, Months.OCT, Months.NOV};
        printTwelweMonths(months);
        printSummerMonths(summerMonths);
        printWinterMonths(winterMonths);
        printAutumnMonths(autumnMonths);
        printAmountOfMonths();
    }
    public static void printWinterMonths(Months[] win) {
        for (Months winter : win) {
            System.out.print(winter + "*");
        }
    }
    public static void printSummerMonths(Months[] sum) {
        for (Months summer : sum) {
            System.out.println(summer + " ");
        }
    }
    public static void printTwelweMonths(Months[] twelweMonths) {
        for (Months all : twelweMonths) {
            System.out.print(all + " ");
        }
    }
    public static void printSpringMonths(Months[] sprg) {
        for (Months spring : sprg) {
            System.out.println(spring + ".");
        }
    }
    public static void printAutumnMonths(Months[]autm){
        for(Months autumn:autm){
            System.out.println(autumn+" ");
        }
    }
    public static void printAmountOfMonths(){
        System.out.println(12+" Months in year.");
    }

    }



