public class WorkHW9 {

    public static void main(String[] args){

        CellPhone cellOld =  new CellPhone();

        cellOld.setBrand("Apple");
        cellOld.setModel("iPhone 6");
        cellOld.setScreenSize(8.25);


        String oldBrand = cellOld.getBrand();
        String oldModel = cellOld.getModel();
        double oldScreen = cellOld.getScreenSize();

        System.out.println( "My old cell has parameters: " + oldBrand + " ," + " " + oldModel + " ,"  + " " + oldScreen ) ;






    }


}
