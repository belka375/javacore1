package workHw19;
/*
 * Homework 19
 *Create the farm class
 *Attributes:
 * Private string name
 * Private address address; (same as in hw 18)
 *Private hashmap < cattle, integer > cattle; (cattle - enum - cattle. cows, cattle. sheeps, cattle. pigs, cattle. chickens, cattle. turkeys... Value - integer - Number of each species
 *Private arraylist < agreecultural > agreecultural; (agreecultural - class
 *Private string nameofculture
 *Private int fielsnumber
 *Printinfo () - is to print all information on the farm
 */

 import java.util.*;

    public class Work {

        public static void main(String[] args) {

            var address = new Address("2020 Green Road","Santa Clara","CA",95606);

            var agriculture = new ArrayList<AgriCulture>();
            agriculture.add(new AgriCulture ("AgroAcres",2));
            agriculture.add(new AgriCulture("Horticulture",4));
            agriculture.add(new AgriCulture("ProGro",7));
            agriculture.add(new AgriCulture("Seed Deed",3));


            var cattle=new HashMap<Cattle,Integer>();
            cattle.put(Cattle.SHEEPS,100);
            cattle.put(Cattle.CHICKENS,135);
            cattle.put(Cattle.TURKEYS,120);
            cattle.put(Cattle.COWS,30);

            var hisfarm = new Farm("FARMella",address,agriculture,cattle );
            hisfarm.PrintInfo();
        }
    }