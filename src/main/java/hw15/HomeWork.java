package hw15;

public class HomeWork {
    public static void main(String[] args) {
        Mascara diorMascara=new Mascara("Dior","DiorShow", Color.BLACK,22);
        Lipstick macLipstick = new Lipstick("Mac",  "Ruby", Color.RED, 15);
        Blush benefitBlush = new  Blush("Benefit", "Blush",Color.BRONZE, 28);
        Powder chanelPowder =  new Powder("Canel", "Coco",  Color.BEIGE, 35);


        ProtoCoscmetic ruby = new Lipstick("Ruby", "Lipstick", Color.PINK,  12);
        ProtoCoscmetic urbanDecay= new Blush("Urban Decay", "Blush", Color.ROSE,  33);
        ProtoCoscmetic lancome = new Mascara("Lancome", "Defenicils", Color.BROWN, 24);
        ProtoCoscmetic laura=new Powder("Laura Mercier", "Finish",Color.BEIGE, 50);



//       diorMascara.printInfo();
//       macLipstick.printInfo();
//       benefitBlush.printInfo();
//       chanelPowder.printInfo();
//       ruby.printInfo();
//       urbanDecay.printInfo();
//       lancome.printInfo();
//       laura.printInfo();

        printCosmetic(ruby);
        printCosmetic(lancome);
        printCosmetic(urbanDecay);
        printCosmetic(laura);

    }

    private static void printCosmetic(ProtoCoscmetic p) {
        p.printInfo();
    }

}
