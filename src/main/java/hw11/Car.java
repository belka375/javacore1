package hw11;

public class Car {

    private String name;
    private CarColors color;
    private int[] prices;
    private CarColors[] colors;
    
    public Car (String name, CarColors color, int[] prices) {
        this.name = name;
        this.color = color;
        this.prices = prices;
    }

    public Car (CarColors[] colors) {
        this.colors = colors;
    }

    public void setColors(CarColors[] colors) {
        this.colors = colors;
    }
}
