package hw15;

public  class Tree implements Plant {
    private String name;
    private String type;

    public Tree(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public void printInfo(){
        System.out.println(name);
        System.out.println(type);
    }
}
