package hw15yp;

public class FoodStore extends Store {
    private String specialDepartment;
    private String managerName;
    private int yearlyBudget;


    public FoodStore(String name, String location, int numberOfEmployees, String specialDepartment, String managerName, int yearlyBudget) {
        super(name, location, numberOfEmployees);
        this.specialDepartment = specialDepartment;
        this.managerName=managerName;
        this.yearlyBudget=yearlyBudget;
    }

    public String getSpecialDepartment() {
        return specialDepartment;
    }

    public void setSpecialDepartment(String specialDepartment) {
        this.specialDepartment = specialDepartment;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
    public int getYearlyBudget() {
        return yearlyBudget;
    }

    public void setYearlyBudget(int yearlyBudget) {
        this.yearlyBudget = yearlyBudget;
    }

    @Override
    public void printStoreInfo() {
        System.out.println("Store name - "+name+"\nLocation: "+location+ "\nNumber of employees: "+numberOfEmployees+"\nSpecial department:" +specialDepartment+ "\nManagers name: "+managerName+"\nYearly Budget: "+yearlyBudget);

    }
}
