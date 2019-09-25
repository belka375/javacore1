package hw15byTanik;

public class Plod implements Edible {

        private String type;
        private String color;
        private double weightGr;
        private boolean organic;
        private String category;

    public Plod(String type, String color, double weightGr, boolean organic) {
            this.type = type;
            this.color = color;
            this.weightGr = weightGr;
            this.organic = organic;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setWeightGr(double weightGr) {
            this.weightGr = weightGr;
        }

        public void setOrganic(boolean organic) {
            this.organic = organic;
        }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
            return type;
        }

        public String getColor() {
            return color;
        }

        public double getWeightGr() {
            return weightGr;
        }

        public boolean getOrganic() {
            return organic;
        }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
        public void printInfo() {
            System.out.print("\n"+category+" Info: " + type + ", " + color + ", " + weightGr);
            if (getOrganic()) {
                System.out.print(", organic.");
            } else {
                System.out.print(".");
            }
        }

    }
