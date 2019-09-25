package hw14;

public class Store {
    private Name storeName;
    private Type storeType;
    private Department department;

    public Store(Name name, Type type, Department department) {
        this.storeName = name;
        this.storeType= type;
        this.department = department;
    }

    public Type getStoreType() {
        return storeType;
    }

    public Name getStoreName() {
        return storeName;
    }

    public Department getDepartment() {
        return department;
    }
}
