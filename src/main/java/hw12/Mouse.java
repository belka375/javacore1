package hw12;

public class Mouse {
    private String model;
    private String brand;
    private int buttonscount;
    private boolean wireless;

    public Mouse(String model, String brand, int buttonscount, boolean wireless){
        this.model=model;
        this.brand=brand;
        this.buttonscount=buttonscount;
        this.wireless=wireless;
    }

    private String wireless(){
        if (wireless) {
            return "wireless";
        }else {
            return "wired";
        }
    }

    public void printClass(){
        System.out.println("Mouse - "+model+" by "+brand+" ( "+buttonscount+" buttons, "+wireless()+" )");
    }

}
