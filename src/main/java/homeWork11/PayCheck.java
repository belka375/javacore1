package homeWork11;

public class PayCheck {

    private Employee emp1;
    private WeekDay day;
    private double sum;

    public PayCheck(Employee name, WeekDay day, double value) {
        this.emp1 = name;
        this.day = day;
        this.sum = value;
    }
    public PayCheck(){}

    public void setEmp1(Employee emp1) {
        this.emp1 = emp1;
    }

    public void setDay(WeekDay day) {
        this.day = day;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Employee getEmp1() {
        return emp1;
    }

    public WeekDay getDay() {
        return day;
    }

    public double getSum() {
        return sum;
    }

    public void printCheckInfo() {
        System.out.println("PayCheck Information 'LUCH',LLC \nEmployee-" + emp1+ "\nEvery "+day +"\n"+sum);

    }
}
