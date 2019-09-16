package hw10;

public class Artist {

    private String name;
    private int age;
    private String[] albums;

    public Artist (String name, int age, String[] albums) {
        this.name = name;
        this.age = age;
        this.albums = albums;
    }

    public Artist() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAlbums(String[] albums) {
        this.albums = albums;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String[] getAlbums() {
        return albums;
    }

    public void printArtist(){
        System.out.println("___This is Artist:");
        System.out.println(name + " " + age);
        for (String album: albums){
            System.out.print(album + " ");
            System.out.println("");
        }
    }
}
