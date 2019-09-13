package hw8;

public class Animal {
    public String type;
    public int age;
    public String name;

    public void playSound(String sound) {System.out.println(sound);}
    public void whatDoesTheFoxSay(String sound) {
        System.out.println(sound + " " + sound + " " + sound + " " + sound);
    }
}
