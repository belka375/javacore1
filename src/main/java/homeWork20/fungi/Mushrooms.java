package homeWork20.fungi;

public class Mushrooms implements Fungi {
    int size;
    String food;

    public Mushrooms(int size, String food) {
        this.size = size;
        this.food = food;
    }

    @Override
    public void size() {
        System.out.println("This mushrooms size is: "+size+" inches;");

    }

    @Override
    public void food() {
        System.out.println("Mushrooms are used extensively in cooking, in many cuisines (notably Chinese, Korean, European, and Japanese).");

    }
}
