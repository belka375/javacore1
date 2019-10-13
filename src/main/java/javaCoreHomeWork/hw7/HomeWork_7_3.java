package javaCoreHomeWork.hw7;

public class HomeWork_7_3 {
    public static void main(String[] args) {
        int[]numb2=new int[]{3, 9, 1, 8, 4, 8, 5};
        System.out.println(getMinimum(numb2));
    }
    private static int getMinimum(int[]numb2){
        int minimum=numb2[0];
        for(int i=0;i<numb2.length;i++){
            if(numb2[i]<minimum){
                minimum=numb2[i];
            }
        }
        return minimum;
    }
}

