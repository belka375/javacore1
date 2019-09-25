package hw15yp;


public class Work15 {
    public static void main(String[]args){
        FoodStore kroger=new FoodStore("Kroger", "Atlanta Peachtree corners, Ga", 88,"Gas station","Mark Kirstein",20000000);
        ToolsStore homedepot=new ToolsStore("Home Depot", "101, Wicksteed Ave., Toronto, ON", 130,"Canada", false);

        ProtoStore publix=new FoodStore("Publix", "Tampa Windword plaza, Fl", 56,"Pharmacy","Gail Smith", 3000000);
        ProtoStore lowes=new ToolsStore("Lowes", "120Col. Rinconada de Aragón", 70,"Mexico",true);

        kroger.printStoreInfo();
        System.out.println("******************");
        homedepot.printStoreInfo();
        System.out.println("******************");
        publix.printStoreInfo();
        System.out.println("******************");
        lowes.printStoreInfo();




    }
}
