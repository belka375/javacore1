package HW8;
public class Work {
    public static void main(String[] args) {
    Building empire_State_Building = new Building();
    empire_State_Building.adress = "350 Fifth Avenue, Manhattan, New York 10118";
    empire_State_Building.buildingcompanyname = "Empire State Inc.";
    empire_State_Building.buildingmaterials = new String[]{"steel", "concreet","glass"};
    empire_State_Building.yearofbuild = 1931;
    empire_State_Building.stories = 102;
    empire_State_Building.sqfeet = 2248355;
    empire_State_Building.energyforpowerpermonth = 1000.0;
    empire_State_Building.energyforhvacpermonth = 800.0;
    empire_State_Building.solarenergyproductionpermonth = 0.0;
    empire_State_Building.energyconsumption(empire_State_Building.energyforhvacpermonth,empire_State_Building.energyforpowerpermonth,empire_State_Building.solarenergyproductionpermonth);

    Building white_Hous = new Building();
    white_Hous.adress = "1600 Pennsylvania Avenue NW, Washington, D.C. 20500";
    white_Hous.buildingcompanyname = "James Hoban";
    white_Hous.buildingmaterials = new String[]{"briks","wood"};
    white_Hous.yearofbuild = 1800;
    white_Hous.stories = 6 ;
    white_Hous.sqfeet = 55000;
    white_Hous.energyforpowerpermonth = 1500.3;
    white_Hous.energyforhvacpermonth = 300.2;
    white_Hous.solarenergyproductionpermonth= 250.3;
    white_Hous.energyconsumption(white_Hous.energyforhvacpermonth,white_Hous.energyforpowerpermonth,white_Hous.solarenergyproductionpermonth);

    Phone iphone11 = new Phone();
    iphone11.brand = "Apple";
    iphone11.color =  "Black";
    iphone11.operatingsystem = "iOS11";
    iphone11.screendimetion =  new int[]{1792,828};
    iphone11.tochscreen = true;
    iphone11.ring();
    iphone11.displeynumber(0);

    Phone note10 = new Phone();
    note10.brand = "Samsung";
    note10.color = "Charcoal";
    note10.operatingsystem = "Android 9 Pie";
    note10.screendimetion = new int[]{2280,1080};
    note10.tochscreen = true;
    note10.ring();
    //переменной типа long не хватает описать номер телефона...
    note10.displeynumber(1287894685);

    Star sun = new Star();
    sun.distance = 1;
    sun.color = "white";
    sun.mass = 1;
    sun.temperature = 5778;
    sun.type = "G2V";
    sun.apparentmagnitude = -26.74;
    sun.radiantpower(2, 5, 12);

    Star uy_scuti = new Star();
    uy_scuti.distance = 9500;
    uy_scuti.color = "red";
    uy_scuti.mass = 10;
    uy_scuti.temperature = 3365;
    uy_scuti.type = "M4Ia";
    uy_scuti.apparentmagnitude = 10.56;
    uy_scuti.radiantpower( 45,64, 12);

    }


}
