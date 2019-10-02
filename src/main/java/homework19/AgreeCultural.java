package homework19;



public class AgreeCultural{
    private String nameOfCulture;
    private int filesNumber;

    public AgreeCultural(String nameOfCulture, int filesNumber){
        this.filesNumber=filesNumber;
        this.nameOfCulture=nameOfCulture;
    }

    public void printInfo(){

        System.out.println(nameOfCulture+" in the field # "+filesNumber);
    }
}

