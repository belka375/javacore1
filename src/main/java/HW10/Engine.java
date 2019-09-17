package HW10;

public class Engine {
    private String model;
    private String manufacturer;
    private int cylindercount;
    private int[] firingorder;

    public Engine(){}

    public Engine(String model, String manufacturer, int cylindercount, int[] firingorder){
        this.model=model;
        this.manufacturer=manufacturer;
        this.cylindercount=cylindercount;
        this.firingorder=firingorder;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setCylindercount(int cylindercount) {
        this.cylindercount = cylindercount;
    }

    public void setFiringorder(int[] firingorder) {
        int i=firingorder.length;
        if(i==cylindercount){
        this.firingorder = firingorder;
        }else {
            cylindercount=firingorder.length;
            System.out.println("Cylinder count for "+model+" not right");
        }
    }

    public String getModel(){return model;}
    public String getManufacturer(){return manufacturer;}
    public int getCylindercount(){return cylindercount;}
    public int[] getFiringorder(){return firingorder;}

    public void printClass(){
        System.out.println("Engine model = "+model+"; manufacturer = "+manufacturer+"; cylinders = "+cylindercount);
        System.out.print("Firing order =");
        for (int i:firingorder) {
            System.out.print(i+", ");
        }
        System.out.println("   ");
    }



}
