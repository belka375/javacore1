package hw14_2;

public class Pool {
    private String hours;
    private int waterTemperature;
    //    private int length;
//    private int depth;
    private Dimensions dimensions;
    private Boolean isOutdoor;

    public Pool(String hours, int waterTemperature, Dimensions dimensions, Boolean isOutdoor) {
        this.hours = hours;
        this.waterTemperature = waterTemperature;
//        this.length = length;
//        this.depth = depth;
        this.dimensions=dimensions;
        this.isOutdoor = isOutdoor;
    }

    public String getHours() {
        return hours;
    }

    public int getWaterTemperature() {
        return waterTemperature;
    }

//    public int getLength() {
//        return length;
//    }
//
//    public int getDepth() {
//        return depth;
//    }


    public Dimensions getDimensions() {
        return dimensions;
    }

    public Boolean getOutdoor() {
        return isOutdoor;
    }
    public void printPool(){
        System.out.println("Pool hours: "+hours+"\nTemperature of water: "+waterTemperature+" degrees Celcium\nPool dimensions: ");
        dimensions.printPoolDimensions();
        if (isOutdoor){
            System.out.println("Outdoor");
        }else{
            System.out.println("Indoor");
        }
    }

}
