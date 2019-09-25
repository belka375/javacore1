package hw14;

public class Trees extends Live {
    private String treeName;

    public Trees(Continent continent,String country, Region region, String treeName){
        super(continent,country, region);
        this.treeName=treeName;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }
    public void printTreeInfo(){
        printWorldMapInfo();
        System.out.println("Name of tree: "+treeName);
    }
}
