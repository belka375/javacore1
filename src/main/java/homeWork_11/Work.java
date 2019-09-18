package homeWork_11;

public class Work {
    public static void main(String[] args) {


        //Formula 1 class

        Formula1 team1 = new Formula1(F1Teams.MCLAREN, Engine.E_RENAULT, 4.3);

        team1.printTeamInfo();
        System.out.println("\n=============");

        Formula1 team2 = new Formula1();
        team2.setTeamX(F1Teams.RED_BULL);
        team2.setEngine(Engine.E_HONDA);
        team2.setDriversSallary(14.9);

        team2.printTeamInfo();
        System.out.println("\n=============");

        Formula1 team3 = new Formula1(F1Teams.MERCEDES, Engine.E_MERCEDES, 65.5);

        team3.printTeamInfo();
        System.out.println("\n=============");




        // T-shirt size class

        SizeChart[] sizeArray = new SizeChart[]{SizeChart.XS, SizeChart.S, SizeChart.M, SizeChart.L, SizeChart.XL, SizeChart.XXL};

        printSizes(sizeArray);
        System.out.println("\n=============");


        SizeChart sc = getRightSize(35);
        System.out.println(sc);

    }

    public static void printSizes(SizeChart[] t) {
        for (SizeChart tt : t) {
            System.out.println(tt);
        }

    }

    public static SizeChart getRightSize(int value) {
        if (value <= 29) {
            return SizeChart.XS;
        }
        if (value <= 32) {
            return SizeChart.S;
        }
        if (value <= 35) {
            return SizeChart.M;
        }
        if (value <= 39) {
            return SizeChart.L;
        }
        if (value <= 43) {
            return SizeChart.XL;
        } else return SizeChart.XXL;
    }

}





