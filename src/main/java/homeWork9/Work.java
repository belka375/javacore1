package homeWork9;

public class Work {

    public static void main(String[] args) {
        // CellPhone#1
        CellPhone Samsung10= new CellPhone();
        Samsung10.setBrand("Samsung");
        Samsung10.setModel("10+");
        Samsung10.setScreenSize(6);

        String samBr=Samsung10.getBrand();
        String samMod=Samsung10.getModel();
        double screen=Samsung10.getScreenSize();

        System.out.println(samBr+" "+samMod+" "+screen);

        System.out.println("-----------------------------------------------------------");


        // CellPhone#2
        CellPhone iPhoneXS_Max= new CellPhone();
        iPhoneXS_Max.setBrand("iPhone");
        iPhoneXS_Max.setModel("XS Plus");
        iPhoneXS_Max.setScreenSize(6.1);

        String iBrand=iPhoneXS_Max.getBrand();
        String iModel=iPhoneXS_Max.getModel();
        double iScreen=iPhoneXS_Max.getScreenSize();

        System.out.println(iBrand+" "+iModel+" "+iScreen);







    }
}
