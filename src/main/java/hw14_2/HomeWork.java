package hw14_2;

import java.time.LocalDateTime;

public class HomeWork {
    public static void main(String[] args) {

        Address addressLaFitness = new Address(100, "Lesnaya street", "San Diego", "CA", 90002);
        Member polinaJohns= new Member("Polina", "Johnes", LocalDateTime.of(1978,12,12,0,0,0,0),Membership.CLASSIC,false);

        Specialities[] peterSpecialities = new Specialities[]{Specialities.CARDIO, Specialities.CYCLE, Specialities.ZUMBA};
        Coach peterBeans =new Coach("Peter", "Beans", LocalDateTime.of(1987, 5,3,0,0,0,0), peterSpecialities, 20.15);


        Dimensions poolLaFitnessDimensions = new Dimensions(50,10,4);
        Pool poolLaFitness =new Pool("8.00 am to 7.00 pm", 24,poolLaFitnessDimensions,true);
        Gym laFitness = new Gym("LA Fitness", addressLaFitness, polinaJohns, peterBeans, poolLaFitness );

        //Создать один супер и 2 или 3 детских
        laFitness.printGymInfo();



        //Создать объекты с глубиной в 3 класса  создать объект и вытащить объект при помощи геттеров
        System.out.println("###############################");
        int length=laFitness.getPool().getDimensions().getLength();
        System.out.println(length);



    }

}
