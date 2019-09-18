package homeWork11;

public class Relative {
    public static void main(String[] args) {

        Sons first = Sons.AIBEK;
        Sons second = Sons.BIKA;
        Sons third = Sons.IMAN;

        Sons son = getAge(21);
        System.out.println(son);

        Sons son2 = getAge( 18);
        System.out.println(son2);

        Sons son3 = getAge(11);
        System.out.println(son3);
    }

    public static Sons getAge(int age){
        if(age ==21){
            return Sons.AIBEK;
        }
        if(age ==18){
            return Sons.BIKA;
        }
        if (age == 11){
            return Sons.IMAN;
        }
        return null;
    }
}
