package homework15;

public class WorkHome15 {
    public static void main(String[] args) {
        RobotDog Guffy = new RobotDog(50, new String[]{"ran", "jump", "bark"}, false);
        Guffy.printInfo();
        RobotHuman Vasya = new RobotHuman(200,new String[]{"run", "walk","jump","take"}, true);
        Vasya.printInfo();
    }


}
