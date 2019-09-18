package homework11;

public class Work {
    public static void main(String[] args) {

        Store Ikea = new Store (Kitchenware.FORK,5);
        Ikea.setUtensils(Kitchenware.SPOON);
        Ikea.getPrice();

        Home MyHome = new Home((new Kitchenware[]{Kitchenware.FORK,Kitchenware.SPOON,Kitchenware.GLASS}), true);
        MyHome.kitchenwareInfo();
    }

}
