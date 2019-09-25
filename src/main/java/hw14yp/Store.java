package hw14yp;

public class Store {
    private Address address;
    private Department department;
    private Brand brands;
    private int level;

    public Store (Address adr, Department depart, Brand br, int level){
        this.address=adr;
        this.department=depart;
        this.brands=br;
        this.level=level;
    }

    public Address getAddress() {
        return address;
    }

    public Department getDepartment() {
        return department;
    }

    public Brand getBrands() {
        return brands;
    }

    public int getLevel() {
        return level;
    }

    public void printStoreInfo(){
        System.out.println( "*** Store info ***");
        System.out.println( "Section Brand: "+brands.toString()+", Floor level: "+level);
        department.printInfo();
    }
}
