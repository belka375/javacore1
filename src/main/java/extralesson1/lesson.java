package extralesson1;

public class lesson {
    public static void main(String[] args) {

        String str="Some string for extra lesson";

        int length=str.length();
        char firstLetter=str.charAt(0);

        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println("\n----------------");
        if(str.equals("Some string for extra lesson")){
            System.out.println("they are equal");
        }

        String[] strArray=str.split(" ");
        String[] strArrayO=str.split("o");

        boolean contain= str.contains("for1");

        String lower = str.toLowerCase();
        String upper = str.toUpperCase();

        String capitalO=str.replace("o","O");
        String triLetter=str.replace("tr","TRRRR");

        String substr=str.substring(4,11);

//        Fish goldFish=new Fish(30,"Karas'",true);
//        double goldFishSizeInInches=goldFish.calculateSizeInInches();
//        System.out.println("Goldfish size ="+goldFishSizeInInches+" inches");
    }
}
