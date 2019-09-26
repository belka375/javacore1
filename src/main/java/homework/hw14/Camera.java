package homework.hw14;

public class Camera extends Item {
    protected String type;
    protected boolean isDigital;
    protected double sensorSize;
    protected int zoom;

    protected Camera(String model,String brand, int yr, double price,Condition condition,boolean sale, String type,boolean isDigital,double sensorSize,int zoom){
        super(model,brand,yr,price,condition, sale);
        this.type=type;
        this.sensorSize=sensorSize;
        this.zoom=zoom;
    }

    protected String getType() {
        return type;
    }

    protected boolean isDigital() {
        return isDigital;
    }

    protected double getSensorSize() {
        return sensorSize;
    }

    protected int getZoom() {
        return zoom;
    }

    public void printCamera() {
        printItem();
        System.out.print("type: "+type+"   sensor size (Mp): "+sensorSize+"   optical zoom: "+zoom+"  ");
         if(isDigital==true) System.out.println("camera type: digital");
         else{
            System.out.println("camera type: film");
             System.out.println("  ");
        }
    }


}
