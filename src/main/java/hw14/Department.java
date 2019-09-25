package hw14;

public class Department {
    private String departmentName;
    private Item item;

    public Department(String name, Item item) {
        this.departmentName = name;
        this.item = item;
    }

    public String getName() {
        return departmentName;
    }

    public Item getItem() {
        return item;
    }
}
