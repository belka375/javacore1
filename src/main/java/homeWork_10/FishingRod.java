package homeWork_10;

public class FishingRod {

    private String brand;
    private String model;
    //rod length in ft
    private double length;
    //rod test in gramm
    private double test;
    private String[] fish;



    public FishingRod(String brand, String model, double length, double test, String[] fish) {
        this.brand = brand;
        this.model = model;
        this.length = length;
        this.test = test;
        this.fish = fish;
    }


    public FishingRod() {
    }

    public void setBrand(String brand) {this.brand = brand;}
    public void setModel(String model) {this.model = model;}

    public void setLength(double length) {
        if (length < 6) {
            System.out.println("WARNING: Length of the rod must be at least 6ft");
            this.length = 6;
        }else{
        this.length = length;}
    }

    public void setTest(double test) {
        if (test <= 0) {
            System.out.println("WARNING: Test of the rod must be at least 1g");
            this.test = 1;
        } else {
            this.test = test;
        }
    }

    public void setFish(String[] fish) {this.fish = fish;}




    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getLength() {
        return length;
    }

    public double getTest() {
        return test;
    }


    public void printClass() {
        System.out.println(brand + " \n" + model + " \nLength = " + length + " \nTest = " + test );
        for (String fsh : fish) {
            System.out.print(fsh + " ");

        }
    }

    public void printDetails(){
        System.out.println("Rod brand - "+brand+"\nRod model - "+model);
    }
}
