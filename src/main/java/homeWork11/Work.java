package homeWork11;

public class Work {
    public static void main(String[] args) {

        Relative[] mySon=new Relative[]{new Relative(Sons.BIKA, 18), new Relative(Sons.AIBEK, 21), new Relative(Sons.IMAN,11)};

//        mySon[0] = new Relative(Sons.AIBEK, 21);
//        mySon[1] = new Relative(Sons.BIKA, 18);
//        mySon[2] = new Relative(Sons.IMAN, 11);
        prinSon(mySon);


        System.out.println("================================");

        Cousins[] cousin = new Cousins[]{Cousins.NUKA, Cousins.NATALY, Cousins.NASTASYA, Cousins.MICHAEL, Cousins.LEO,
                Cousins.BERIK, Cousins.ALIBEK};
        printCousins(cousin);




        RelativeAlmaty cous = new RelativeAlmaty(Cousins.ALIBEK, 10);
        RelativeAlmaty cous2 = new RelativeAlmaty(Cousins.BERIK, 21);
        RelativeAlmaty cous3 = new RelativeAlmaty(Cousins.LEO, 6);
        RelativeAlmaty cous4 = new RelativeAlmaty(Cousins.MICHAEL, 11);
        RelativeAlmaty cous5 = new RelativeAlmaty(Cousins.NASTASYA, 16);
        RelativeAlmaty cous6 = new RelativeAlmaty(Cousins.NATALY, 30);
        RelativeAlmaty cous7 = new RelativeAlmaty(Cousins.NUKA, 19);



    }

    private static void printCousins(Cousins[] cousin) {
        for (Cousins x: cousin){
            System.out.println(x);
        }
    }


    private static void prinSon(Relative[] mySons){
        for(Relative y: mySons){
        System.out.println(y);
    }



}
}
