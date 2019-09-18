package homeWork11;

public class RelativeAlmaty {

    public static void main(String[] args) {
        Cousins[] cousins = new Cousins[]{Cousins.ALIBEK, Cousins.BERIK, Cousins.LEO, Cousins.MICHAEL,
                                             Cousins.NASTASYA,Cousins.NATALY, Cousins.NUKA};
        printCousins(cousins);
    }

    private static void printCousins(Cousins[] cousins) {
        for(Cousins x: cousins){
            System.out.println(x);
        }
    }

}
