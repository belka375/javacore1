public class Testing {
    public static void main(String[]args){

        int[] yy= new int[] {10,2,2,2,3,6,9,8};

        for(int i=0;i<yy.length;i++) {
             if ( yy[i]==8){
                 System.out.println(yy[i]);
             }
         }
//        System.out.println("help");
//        for(int i=0;i<8;i++) {
//            if(x[i]==8) {
//                System.out.println(x[i]);
//            }
//        }
//        System.out.println("help2");
//        for(int i=0;i<8;i++) {
//            if (x[i] == 8) {
//                System.out.println(x[7]);
//            }
//        }
//        System.out.println("help3");
//        for(int i=0;i<8;i++) {
//            if(x[i]==10) {
//                System.out.println(i);
//            }
//        }
        int[] x={4,5,6,71,2,3};
        x[5]=22;
        for (int n:x) {
            System.out.println(n);
        }
    }
}
