package HomeWork8;

public class Jewerly{
    public  String name;
    public String brand;
    public int model;
    public String materialMe;
    public String materialStone;
    public int price;


    public void printJewerlyInfo(){
        System.out.println(name+ "\nBrand- " + brand + ";\nModel- " + model + "\nMaterials- " + materialMe+ ";\nStone- " + materialStone);
    }
    public void printPrice(){
        System.out.println("Best price- " + price);
    }
    public void printUsage1(){
        System.out.println("for daily usage ");
    }
    public void printUsage2(){
        System.out.println("for Special Events");
    }

}
