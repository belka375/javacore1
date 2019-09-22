package hw11;

public class Car {

    private String name;
    private int[] prices;
    private CarColors[] colors;

    public Car (String name, int[] prices) {
        this.name = name;
        //this.color = color;
        this.prices = prices;
    }

    public void setColors(CarColors[] colors) {
        this.colors = colors;
    }
}
