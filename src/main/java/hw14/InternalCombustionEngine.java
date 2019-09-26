package hw14;

public class InternalCombustionEngine {
    protected String enginModel;
    protected int powerInHP;
    protected int cylinderCount;
    protected String coolingType;

    public InternalCombustionEngine(String enginModelmodel, int powerInHP, int cylinderCount, String coolingType){
        this.enginModel=enginModelmodel;
        this.powerInHP=powerInHP;
        this.cylinderCount=cylinderCount;
        this.coolingType=coolingType;
    }

    public void setModel(String model) {
        this.enginModel = enginModel;
    }

    public void setPowerInWatt(int powerInWatt) {
        this.powerInHP = powerInWatt;
    }

    public void setCylinderCount(int cylinderCount) {
        this.cylinderCount = cylinderCount;
    }

    public void setCoolingType(String coolingType) {
        this.coolingType = coolingType;
    }
}
