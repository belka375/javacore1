package hw14;

public class Work {
    public static void main(String[] args){

        Price price = new Price(5,"$");
        Item item = new Item("Shrimp",price);
        Department sf = new Department("Seafood", item);
        Name wf = new Name();
        wf.setName("Whole Foods");
        Type grocery = new Type();
        grocery.setType("Grocery store");
        Store wholeFoods = new Store(wf, grocery, sf);

        String threeLevels = wholeFoods.getDepartment().getItem().getPrice().getCurrencySymbol();
        System.out.println(threeLevels);



    }
}