package hw19yp;

import hw18yp.Address;

import java.util.ArrayList;
import java.util.HashMap;

public class Work19 {
    public static void main(String[] args) {

//    Создайте класс Farm
//    аттрибуты:
//    private String name;
//    private Address address; (same as in HW 18)
//    private HashMap<Cattle,Integer> cattle; (Cattle - enum - Cattle.COWS,Cattle.SHEEPS, Cattle.PIGS, Cattle.CHICKENS, Cattle.TURKEYS...
//    Value    - Integer - количество голов каждого вида)
//    private ArrayList<AgreeCultural> agreeCultural; (AgreeCultural - class
//    private String nameOfCulture;
//    private int fielsNumber;

//    метод printInfo() - выводит на печать всю информацию по ферме

       var address = new FarmAddress("Sovetskaya street", "Vasuki", "GA", 30005);

       var cattle = new HashMap<Cattle, Integer>();
       cattle.put(Cattle.CHICKENS,20);
       cattle.put(Cattle.COWS,5);
       cattle.put(Cattle.PIGS,68);
       cattle.put(Cattle.SHEEP,55);
       cattle.put(Cattle.TURKEYS,34);

       var agriCalture = new ArrayList<Agricultural>();
       agriCalture.add(new Agricultural("Commercial Plantations",15));
       agriCalture.add(new Agricultural("Shifting Cultivation", 40));
       agriCalture.add(new Agricultural("Livestock Ranching",12));
       agriCalture.add (new Agricultural("Pastoral farming", 7));

       var farm = new Farm("Kolkhoz 'Rassvet'",address,cattle,agriCalture);
       farm.printInfo();

     }

}
