package hw12;

public class Mouse {
        private Brand mouseBrand;
        private Color mouseColor;
        private boolean mouseWireless;

        public Mouse(Brand brandM, Color colorM, boolean wirelessM) {
            this.mouseBrand = brandM;
            this.mouseColor = colorM;
            this.mouseWireless = wirelessM;
        }
        public void mouseDescription() {
            System.out.println("Mouse: " + "\n\tBrand: " + mouseBrand + "\n\tColor: " + mouseColor + "\n\tWireless: " + mouseWireless + "\n");
        }
    }

