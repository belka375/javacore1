package homeWork15;

public interface Welcome {


    default void printWelcome() {
        System.out.println("Welcome to our online store!!!");
    }

    default void printMore() {
        System.out.println("\nCustomers who viewed this item also viewed: ");
    }
}
