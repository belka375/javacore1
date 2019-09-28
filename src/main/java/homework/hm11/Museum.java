package homework.hm11;

public class Museum {
    public String name;
    public Category category;
    public int yearFounded;

    public Museum(){};
    public void setName(String name){this.name=name;}
    public void setCategory(Category category){this.category=category;}

    public void setYearFounded(int year) {this.yearFounded=year;}


        public Museum(String name,Category category,int yearFounded){
        this.name=name;
        this.category=category;
        this.yearFounded=yearFounded;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public int getYearFounded() {
        return yearFounded;
    }
    public void printMuseum(){
        System.out.println("name: "+name+"   category: "+category+"   founded: "+yearFounded);
    }

}
