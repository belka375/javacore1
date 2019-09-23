package hw13;

public class LawnMover extends InternalCombustionEngine {
    private String lawnMoverModel;
    private int bladesCount;

    public LawnMover(String enginModelmodel, int powerInHP, int cylinderCount, String coolingType,String lawnMoverModel, int bladesCount){
        super(enginModelmodel, powerInHP, cylinderCount, coolingType);
        this.lawnMoverModel=lawnMoverModel;
        this.bladesCount=bladesCount;
    }

    public void setLawnMoverModel(String lawnMoverModel) {
        this.lawnMoverModel = lawnMoverModel;
    }

    public void setBladesCount(int bladesCount) {
        this.bladesCount = bladesCount;
    }
}
