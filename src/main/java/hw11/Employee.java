package hw11;

public class Employee {
    private String employeeName;
    private int level;
    private Degree[] degrees;

    public Employee() {
    }

    public Employee(String employeeName, int level, Degree[] degrees) {
        this.employeeName = employeeName;
        this.level = level;
        this.degrees = degrees;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setDegrees(Degree[] degrees) {
        this.degrees = degrees;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getLevel() {
        return level;
    }

    public Degree[] getDegrees() {
        return degrees;
    }

    public void printEmployeeInfo() {
        System.out.println("*****************");
        System.out.println(employeeName + " " + level + " has degrees:");
        for (Degree degre : degrees) {
            System.out.println(degre);
        }
    }
}
