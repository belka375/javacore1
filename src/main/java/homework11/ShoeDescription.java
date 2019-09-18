package homework11;

public class ShoeDescription {

        private ShoeMaterial ShoeMaterial;
        private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setShoeMaterial(ShoeMaterial ShoeMaterial) {
        this.ShoeMaterial = ShoeMaterial;
    }

    public int getPrice() {
        return price;
    }

    public ShoeMaterial getShoeMaterial() {
        return ShoeMaterial;
    }
    public  void print(){
        System.out.println("These shoes are made out of "+ getShoeMaterial() + ". They cost "+ getPrice());

    }
}

