public class Baba {
    public String name1;
    public int age;
    public int weight;
    public boolean exercise;

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
