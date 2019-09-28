package homework.hm11;

public class Gallery {
    public String name;
    public String owner;
    public int yearFounded;
    public ArtExhibit[] artExhibit;

    public Gallery(){};



    public void setName(String name){this.name=name;}
    public void setOwner(String owner){this.owner=owner;}
    public void setYearFounded(int year){this.yearFounded=year;}
    public void setArtExhibit(ArtExhibit[] artExhibit) {this.artExhibit = artExhibit;}



    public Gallery(String name,String owner,int year,ArtExhibit[] art){
        this.name=name;
        this.owner=owner;
        this.yearFounded=year;
        this.artExhibit=art;
        }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public ArtExhibit[] getArtExhibit() {
        return artExhibit;
    }

    public void printGallery(){
        System.out.print("name: "+name+"   owner: "+owner+"   founded: "+yearFounded+"\ncategories: ");
        for (ArtExhibit a:artExhibit){
            System.out.print(a+"  ");
            }
        System.out.println("  ");
    }
}