package homework.hw14;

public class Item {
  protected String model;
  protected String brand;
  protected int year;
  protected double price;
  protected boolean isOnSale;
  protected Condition condition;

   public Item (String model,String brand,int yr,double price,Condition condition,boolean sale){
       this.model=model;
       this.brand=brand;
       this.year=yr;
       this.price=price;
       this.isOnSale=sale;
       this.condition=condition;
   }

    protected String getModel() {
        return model;
    }

    protected Condition getCondition() {
        return condition;
    }

    protected String getBrand() {
        return brand;
    }


    protected int getYear() {
        return year;
    }

    protected double getPrice() {
        return price;
    }

    protected boolean getIsOnSale(){return isOnSale;}

    protected void printItem(){
        System.out.println("model: "+model+"   brand: "+brand+"   year: "+year+"   price: "+price+"   condition: "+condition);
        if(isOnSale==true){
            System.out.println("on sale");}
        else{
            System.out.println(" ");
        }
    }
}
