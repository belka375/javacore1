package hw15byTanik;

public class Grain implements Edible {

    private String category;
    private String type;
    private boolean organic;

    public Grain(String type, boolean organic){
        this.type=type;
        this.organic=organic;
        this.category="Grain";
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOrganic(boolean organic) {
        this.organic = organic;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public boolean getOrganic(){
        return organic;
    }

    @Override
    public void printInfo() {
        System.out.print("\n"+category+" Info: " + type);
        if (getOrganic()) {
            System.out.print(", organic.");
        } else {
            System.out.print(".");
        }
        }
}
