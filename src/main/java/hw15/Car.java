package hw15;

public  class Car implements Auto {
    private String brand;
    private String model;
    private int hP;
    private int seats;
    public Car(String brand,String model,int hP,int seats){
        this.brand=brand;
        this.hP=hP;
        this.model=model;
        this.seats=seats;
    }
    public void printInfo(){
        System.out.println(brand+" "+model+"\n"+hP+"HP@"+"\n"+"Seats:"+seats);
    }
}
