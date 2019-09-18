package homework11;

public class Work {

    public static void main (String[] args){

        Pets p = getSize(25);
        System.out.println(p);

        Pets[] cats = new Pets[]{Pets.CUP, Pets.SMALL, Pets.MEDIUM, Pets.LARGE};
        Cats cat1= new Cats("Murka", 12, cats);


    }

    public static Pets getSize(int weight){
        if (weight>20){
            return Pets.MEDIUM;
        }
        if (weight>40) {
            return Pets.LARGE;
        }
        if (weight>10){
            return Pets.SMALL;
        }else{
            return Pets.CUP;


            }}}

