package hw14yp;

public class Department {
    private String deptName;
    private Furniture fur1;
    private Decor wallDecor;

    public Department(String deptName, Furniture fur1, Decor wallDecor) {
        this.deptName=deptName;
        this.fur1 = fur1;
        this.wallDecor = wallDecor;
    }

    public String getDeptName() {
        return deptName;
    }

    public Furniture getFur1() {
        return fur1;
    }

    public Decor getWallDecor() {
        return wallDecor;
    }

    public void printInfo(){
        System.out.println( "Department: " +deptName);
        System.out.print("Products: ");
        fur1.printInfo(); wallDecor.printInfo();
    }
}
