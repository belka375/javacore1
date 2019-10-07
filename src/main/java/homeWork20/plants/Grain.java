package homeWork20.plants;

public class Grain implements Plants {
    String name;
   String year;
    public static int count;

    public Grain(String name, String year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public void food() {
        count++;
        System.out.println("This "+name + " A grain crop is a grain-producing plant. The two main types of commercial grain crops are cereals and legumes."+ "Count =>" +count);

    }

    @Override
    public void discover() {
        System.out.println("This Grain was discover in =>"+ year);
    }
}
