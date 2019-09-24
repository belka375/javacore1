package hw10;

public class Work {
    public static void main(String[] args) {
        Apple apple11=new Apple();
        Apple appleXS=new Apple();
        int[] memory=new int[]{64,128,256};
        Europe scandinavia=new Europe("Denmark","Vajle","Copenhagen");
        Europe baltic=new Europe("Estonia","Tartu","Tallinn");

        String[] majors=new String[]{"Math","Biology","History"};
        School school1=new School("High School","Chicago","Public", majors);
        School school2=new School("High School","Naperville","Private", majors);

        apple11.setModel("iPhone");
        apple11.setVersion("Pro");
        apple11.setMemory(64);

        appleXS.setModel("iPhone");
        appleXS.setVersion("XS");
        appleXS.setMemory(128);

//        apple11.appleInfo();
//        appleXS.appleInfo();
        scandinavia.europeInfo();
        baltic.europeInfo();
        school1.schoolInfo();
        school2.schoolInfo();








    }
}
