package hw12;

public class Monitor {
        private Brand monitorBrand;
        private Color monitorColor;
        private double sizeMonitor;

        public Monitor(Brand brandM, Color colorM, double sizeM) {
            this.monitorBrand = brandM;
            this.monitorColor = colorM;
            this.sizeMonitor = sizeM;
        }

        public void monitorDescription() {
            System.out.println("Monitor: " + "\n\tBrand: " + monitorBrand + "\n\tColor: " + monitorColor + "\n\tSize: " + sizeMonitor + "\n");

        }
    }

