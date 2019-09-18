package homework11;

public class Dogs {

    private String breed;
    private String name;
    private Pets size;


    public Dogs(String breed, String name, Pets size){
        this.breed=breed;
        this.name=name;
        this.size=size;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public Pets getSize() {
        return size;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Pets size) {
        this.size = size;
    }


}