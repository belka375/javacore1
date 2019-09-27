package homework.hw15;

public class Installation implements Draw{
    private String category;
    private String medium;
    private int numberOfParts;
    private boolean isVideo;

    public Installation(String category, String medium, int parts, boolean video){
        this.category=category;
        this.medium=medium;
        this.numberOfParts=parts;
        this.isVideo=video;
    }

    public String getCategory() {
        return category;
    }

    public String getMedium() {
        return medium;
    }

    public int getNumberOfParts() {
        return numberOfParts;
    }
    public boolean getIsVideo(){
        return isVideo;
    }

    @Override
    public void printInfo(){
        System.out.println("category: "+category+"   medium: "+ medium+"   parts: "+numberOfParts);
        if(isVideo==true) {
            System.out.println("video");
        }else{
            System.out.println(" ");
        }
    }


    public void printMedium() {
        System.out.println("medium: "+medium);
    }
}
