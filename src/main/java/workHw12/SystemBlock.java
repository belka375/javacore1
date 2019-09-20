package workHw12;

public class SystemBlock{

    private String processor;
    private  double hardrive;
    private String powerSupply;
    private String videoCard;


    public SystemBlock (String  chip, double disk,String ps,String vc){

        processor = chip;
        hardrive = disk;
       // this.ram = ram;
        powerSupply = ps;
        videoCard = vc;
    }
    //getter

    public double getHardDrive()
    {
        return  hardrive;
    }


    public String getProcessor()
    {
        return processor;
    }

    public String getVideoCard()
    {
        return videoCard;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void printSystemBlock(){

        System.out.println( "CPU  = "  + " " + processor + " " + hardrive  + " Hard Drive" +  " Video card  = "+ videoCard + " " + "Power Supply = " + powerSupply );
    }

}