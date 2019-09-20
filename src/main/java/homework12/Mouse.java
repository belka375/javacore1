package homework12;

public class Mouse {
        private String mouseType;
        private String mouseBrand;
        private String mouseColor;
        private double mousePrice;

        public Mouse ( String type, String brand, String color, double price){
            this.mouseType = type;
            this.mouseBrand = brand;
            this.mouseColor = color;
            this.mousePrice = price;
        }

    public double getMousePrice() {
        return mousePrice;
    }

    public String getMouseBrand() {
        return mouseBrand;
    }

    public String getMouseColor() {
        return mouseColor;
    }

    public String getMouseType() {
        return mouseType;
    }

    public void mouseInfo() {
            System.out.println("Mouse "+mouseType+" "+" "+mouseBrand+" "+mouseColor+" "+mousePrice);
        }


}
