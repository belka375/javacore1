package HW15;

public class Work {
    public static void main(String[] args) {
        ProtoPhone samsung = new Phone("Samsung", 1232);
        ProtoPhone iPhone = new Phone("iPhone", 1349);
        ProtoPhone headset = new Accessories("samsung", 200);
        ProtoPhone bundle = new Accessories("iPhone", 1200);

        ptintPhone(samsung);
        ptintPhone(iPhone);
        ptintPhone(headset);
        ptintPhone(bundle);


    }

    private static void ptintPhone(ProtoPhone access) {
        access.printInfo();
    }


}