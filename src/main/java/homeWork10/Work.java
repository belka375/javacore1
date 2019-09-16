package homeWork10;

public class Work {
    public static void main(String[] args) {

        String[] colors= new String[]{"White", "Black", "Blue"};
        // Buds#1  ------------------------------------------------------------------------------------
        EarBuds earBuds2364=new EarBuds("EarBuds #2364", 349.99, 2.5, colors);

        earBuds2364.printBudsInfo();
        // Buds#2 --------------------------------------------------------------------------------------
        EarBuds earBuds1414 =new EarBuds();
        earBuds1414.setName("EarBuds #1414");
        earBuds1414.setPrice(349.99);
        earBuds1414.setWarranty(2.5);
        earBuds1414.setColor(colors);

        earBuds1414.printBudsInfo();
        //Kitten#1------------------------------------------------------------------------------------------
        String[] tem= new String[]{"friendly", "smart", "cute"};
        Kittens leonardo=new Kittens("Leonardo", "Rosset on Gold", 450.01, tem);

        leonardo.printCat();
        //Kitten#2----------------------------------------------------------------------------------------------
        Kittens francesca= new Kittens();
        francesca.setName("Francesca");
        francesca.setColor("Spot on Silver");
        francesca.setPrice(259.99);
        francesca.setTemper(tem);

        francesca.printCat();
        //Glasses#1 -----------------------------------------------------------------------------------------
        String[] colors1= new String[]{"Brown", "Black", "Gold"};
        Glasses sungl1=new Glasses("Prada", 3348, colors1, 399.99);

        sungl1.printGlassesInfo();
        //Glasses#2 -----------------------------------------------------------------------------------------
        Glasses sungl22= new Glasses();
        sungl22.setBrand("CHANEL");
        sungl22.setModel(19);
        sungl22.setColors(colors1);
        sungl22.setPrice(699.99);

        sungl22.printGlassesInfo();
    }
}
