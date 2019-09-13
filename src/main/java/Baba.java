public class Baba {
    String name1;
    int age;
    int weight;
    boolean exercise;

    public boolean yagodka (int a, int b, boolean c) {
        if (a > 40 && b < 130 && c == true) {
            System.out.println("yagodka");
            return true;
        } else {
            System.out.println("ne yagodka");
            return false;
        }
    }

    public void whoIsIt () {
        System.out.println(name1 + " " + age+ " ");
    }

}
