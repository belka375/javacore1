package hw11;

public class DriversByAge {
    private CarsBody carsBody;
    private int age;
    private String groupName;
    private String driverName;

    public DriversByAge(String driverName,CarsBody carsBody,int age,String groupName){
        this.driverName=driverName;
        this.age=age;
        this.carsBody=carsBody;
        this.groupName=groupName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCarsBody(CarsBody carsBody) {
        this.carsBody = carsBody;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public CarsBody getCarsBody() {
        return carsBody;
    }

    public int getAge() {
        return age;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getGroupName() {
        return groupName;
    }
    public void printDriversInfo(){
        System.out.println("Driver name:"+driverName+"."+"\nCars body:"+carsBody+","+"Age:"+age+"."+"\n"+groupName);
    }
}
