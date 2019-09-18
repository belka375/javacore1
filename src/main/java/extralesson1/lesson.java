package extralesson1;

public class lesson {
    public static void main(String[] args){
//        Fish goldFish = new Fish(30, "Karas", true);
//
//        double goldFishSizeInInches=goldFish.calculateSizeInInches();
//        System.out.println("Goldfish size = " +goldFishSizeInInches+ " inches");
        //pring sentense from the end
       String str = "Some string for extra lesson";
       int length = str.length();
       char firstletter=str.charAt(0);
       for(int i=str.length()-1;i>=0;i--){
           System.out.print(str.charAt(i));
       }
        System.out.print("\n**************");

       //comparation of strings
        if(str.equals("Some string for extra lesson")){
            System.out.println("they are equal");
        }
        System.out.print("\n**************");
        //разделить предложение по словам(по пробелу) - при этом делитель удаляется

        String[] strArray=str.split(" ");
        String[] strArrayo=str.split("o");

        //найти в стринге патерн "for1"

        boolean contain = str.contains("for1");
        //заменить все заглавные буквы на маленькие

        String lower=str.toLowerCase();
        String toApper = str.toUpperCase();

        String capitalO =  str.replace("o","O");
        String capitaltr =  str.replace("tr","TRRR");

        //вернуть часть  предложения отрезав первые 4 буквы предложения и потом только до 11
        String subString = str.substring(4,11);







    }
}
