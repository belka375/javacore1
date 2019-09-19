package hw11;

public class Wine {
    private String name;
    private Colors[]colors;

    public Wine(String name,Colors[]colors){
        this.colors=colors;
        this.name=name;
    }
    public void printWine(){
        System.out.println(name);{
            for(Colors c:colors){
                System.out.println(c);
            }
        }
    }
}
