public class Classes {
    public static void main (String[]args){
        Dogs sobaka = new Dogs();
        sobaka.bark();
        sobaka.bite();

        Dogs dog = new Dogs();
        dog.name = "Fibi";
        dog.paws = 4;
        dog.collar = "leather";
        dog.fur ="soft";

        dog.printDogsAttributes();



        Pen pen = new Pen();

        pen.write();
        pen.ink = "black";
        pen.color = "red";
        pen.length = 6;
        pen.type ="automatic";

        pen.penAttributes();






    }
}
