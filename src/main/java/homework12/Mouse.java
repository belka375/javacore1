package homework12;


public class Mouse {
    private String type;
    private String kind;

    public Mouse(String type, String kind) {
        this.type = type;
        this.kind = kind;

    }


    public String getType() {
        return type;
    }

    public String getKind() {
        return kind;
    }
    public void printMouseInfo(){
        System.out.println("This mouse :" +type+ " "+kind);
    }
}