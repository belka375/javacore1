package lesson19;


public class ClassWork {
    public static void main(String[] args) {
        var outer = new Outer(135, "Biological", 50.5);
        var inner = outer.new Inner(5, 25, 30);

        System.out.println("===========================");
        outer.printInfo();
        inner.printInfo();
        System.out.println("===========================");

        System.out.println(inner.getFlowers() + inner.getTables() + inner.getWindows());
        System.out.println("===========================");

        var pr = new PrintIt<String>("Hii my love...");
        pr.printInfo();
        System.out.println("===========================");

        var pr1 = new PrintIt<Integer>(18795);
        pr1.printInfo();
        System.out.println("===========================");
        var pr2 = new PrintIt<Double>(65.9);
        pr2.printInfo();


        try {
            var x = 10 / 0;
            System.out.println("===========================");
        } catch (Exception x){
            System.out.println("Exception!!!!!Hii It is me -> Exception!!!!"+x.getMessage());
        }
    }
}
