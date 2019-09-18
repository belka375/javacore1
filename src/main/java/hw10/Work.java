package hw10;

public class Work {
    public static void main(String[] args) {
        Apple apple=new Apple();

        String[] appleModels=new String[]{"11", "Pro", "Pro Max"};
        String[] appleMemory=new String[]{"64", "128", "256"};

        apple.setModel("iPhone");
        apple.setVersion("Pro");
        apple.setMemory("64 GB");

        apple.appleInfo();

    }
}
