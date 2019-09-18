package homework11;

public class Work {

    public static void main (String[] args){

        Pets p = getSize(25);
        System.out.println(p);

        Pets[] cats = new Pets[]{Pets.CUP, Pets.SMALL, Pets.MEDIUM, Pets.LARGE};
        Cats cat1= new Cats();
       cat1.setAge(12);
        Breeds[] breed = new Breeds[]{Breeds.BRITISH, Breeds.DOMESTIC, Breeds.RUSSIAN_BLUE, Breeds.SCOTTISH};
        Cats c1= new Cats();
        Cats c2= new Cats();

        c1.setName("Murka");
        c1.setAge(5);
        Breeds[]bbb=new Breeds[]{Breeds.BRITISH, Breeds.DOMESTIC};
        c1.setBreeds(bbb);
        c1.printBreeds();


        c2.setName("Vas'ka");
        c2.setAge(10);
        Breeds[]aaa=new Breeds[]{Breeds.RUSSIAN_BLUE};
        c2.setBreeds(aaa);
        c2.printBreeds();

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

