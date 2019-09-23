package hw12;

public class SystemBlock {
    private String processor;
    private String powerUnit;
    private String hardDrive;

    public SystemBlock(String processor, String powerUnit, String hardDrive){
        this.processor=processor;
        this.hardDrive=hardDrive;
        this.powerUnit=powerUnit;
    }

    public void setProcess(String ps){
        this.processor=ps;
    }

    public void setPowerUnit(String pU){
        this.powerUnit=pU;
    }

    public void setHardDrive(String hD){
        this.hardDrive=hD;
    }

    public String getProcessor() {
        return processor;
    }

    public String getPowerUnit(){
        return powerUnit;
    }

    public String getHardDrive(){
        return hardDrive;
    }

    public void printSystemBlock(){
        System.out.print("Processor: "+processor+"; Power Unit: "+powerUnit+"; Hard Drive: "+hardDrive+";");
    }
}
