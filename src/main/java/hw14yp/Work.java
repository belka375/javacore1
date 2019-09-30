package hw14yp;

import java.util.logging.Level;

public class Work {
    public static void main (String []args){
        // SUPERCLASSES
        // Создать один супер и 2 или 3 детских
        //Создать объекты с глубиной в 3 класса  создать объект и вытащить объект при помощи геттеров

        Triangle shapeOne = new Triangle("Triangle","black",18.4, Thickness.THICK, 3,3,"Acute");

        Square shapeTwo = new Square("Square", "Blue", 36,Thickness.NORMAL,4,4,4);

        Circle shapeThree = new Circle("Circle","yellow",50.24,Thickness.THIN,8,false);

        shapeOne.printShape();
        shapeOne.printTriangle();
        shapeTwo.printShape();
        shapeTwo.printSquare();
        shapeThree.printShape();
        shapeThree.printCircle();

        System.out.println("****--------------------------------------****");

        //Создать объекты с глубиной в 3 класса  создать объект и вытащить объект при помощи геттеров

        Address adr1= new Address("Macy's North Point Mall", "North circle dr.","Atlanta","GA",30002);
        Furniture furniture=new Furniture ("Dining table");
        Decor wallDecoration= new Decor("Wallpaper 'birch'");
        Department home=new Department("Home", furniture, wallDecoration);

//        Brand brand1=new Brand {Brand.CALVIN_KLEIN,Brand.DKNY,Brand.TOMMY_HILFIGER};

        Store macys1 = new Store(adr1, home,Brand.TOMMY_HILFIGER,4 );
        String product1=macys1.getDepartment().getWallDecor().wallDecor;

        String product2=macys1.getDepartment().getFur1().furnitureTable;

        System.out.println(product1);
        System.out.println(product2);

        System.out.println("-------------------");

        adr1.printAddress();
        macys1.printStoreInfo();

    }
}