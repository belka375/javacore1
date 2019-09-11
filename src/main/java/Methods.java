public class Methods {
//Homework1
    public static void main(String[] args) {
        System.out.println("1) & 2)  Hello, my name is Tatyana Kotova!!!");
        String name = "3) Hello , my name is Kotova Tatyana...";
        System.out.println(name);
        String lastName = "4) Hello, my last name too famous to write it here!!!))) ";
        System.out.println(lastName);
        int a = 44;
        int b = 55;
        String dad = "My dad is ";
        String mom = "  My mom is ";
        System.out.println("5) " + dad + b + mom + a);
        // =============================================================================

        int[] arrays = {2, 78, 56, 89, 42, 78, 26, 63, 69};
        for (int i = 0; i <= arrays.length - 1; i++) {
            System.out.println("homework 2.1) " + arrays[i]);
        }

        int[] arrays1 = {2, 78, 56, 89, 42, 78, 26, 63, 69};
        for (int i = arrays1.length - 1; i >= 0; i--) {
            System.out.println("homework 2.2) " + arrays1[i]);
        }

        int[] arrays2 = {2, 78, 56, 89, 42, 78, 26, 63, 69};
        for (int i = 0; i <= arrays2.length - 1; i = i + 2) {
            System.out.println("homework 2.3) " + arrays2[i]);
        }

        int[] arrays3 = {55, 22, 10, 56, 89, 42, 2, 26, 63, 69};
        arrays3[0]=55;
        int min = arrays3[0];

        for (int i = 0; i <= arrays3.length - 1; i++) {
            if (min > arrays3[i]) {
                min = arrays3[i];
            }
        }
        System.out.println("extra д / homework " + min);

        int[] arrays4 = {55, 22, 10, 56, 89, 42, 2, 26, 63, 69};
        arrays4[0]=55;
        int max = arrays3[0];

        for (int i = 0; i <= arrays3.length - 1; i++) {
            if (max < arrays3[i]) {
                max = arrays3[i];
            }
        }
        System.out.println("extra г / homework " + max);

        int[] arrays5 = {55, 22, 10, 56, 89, 42, 2, 26, 63, 69};

        for (int i = 0; i <= arrays5.length - 1; i++) {

            if (arrays5[i] % 2 == 1){
                System.out.println("extra e / homework " + arrays5[i]);

            }if (arrays5[i]%2 ==0){
                System.out.println("Homework extra ~/ " + arrays5[i]);
            }
        }
        int[] arrays6 ={10,15,12,7,88,10,6,17,23,10,10,16};
        for(int i=0; i<=arrays6.length; i++){
            if (arrays6[i] == 10){
                System.out.println("Homework extra /// " +i);
            }
        }

    }

}


