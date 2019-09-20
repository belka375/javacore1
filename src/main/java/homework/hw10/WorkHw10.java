package homework.hw10;

import java.util.Arrays;

public class WorkHw10 {
    public static void main(String[]args){

        String[] genV= new String[]{"symbolism","spiritualism"};
        String[] genP=new String[]{"Abstract","Expressionism","realism"};
        String[] genJ=new String[]{"soul","pop","jazz"};
        String[] genSh=new String[]{"metal","prog","rock"};
        int[] yearOfFiAn=new int[]{1911, 1914,1967,1997};
        int[] yearOfFiCh=new int[]{1898,1938,2001};


        Artist vrubel =new  Artist();

        vrubel.setName("Mikhail Vrubel");
        vrubel.setCountry("Russian empire");
        vrubel.setYearOfBirth(1856);
        vrubel.setGenres(genV);
        String vrubelName=vrubel.getName();
        String vrubelCountry=vrubel.getCountry();
        int vrubelYearOfBirth=vrubel.getYearOfBirth();
        String[] vrubelGenres=vrubel.getGenres();

        System.out.print(vrubelName+", "+vrubelCountry+", "+vrubelYearOfBirth+", "+"\ngenres: ");
        for(String ge:genV){
            System.out.print("  "+ge);
            }
        System.out.println("            ");

        Artist pollock=new Artist();

        pollock.setName("Jackson Pollock");
        pollock.setYearOfBirth(1912);
        pollock.setCountry("USA");
        pollock.setGenres(genP);

        String pollockName=pollock.getName();
        int pollockYearOfBirth=pollock.getYearOfBirth();
        String pollockCountry=pollock.getCountry();
        String[] pollockGenres=pollock.getGenres();

        System.out.print(pollockName+", "+pollockCountry+" , "+pollockYearOfBirth+"\ngenres: ");
        for (String ge:genP){
            System.out.print("  "+ge);
        }
        System.out.println("            ");


        Singer jamala= new Singer();

        jamala.setName("Jamala");
        jamala.setActiveNow(true);
        jamala.setCountry("Ukraine");
        jamala.setGenres(genJ);

        String jamalaName=jamala.getName();
        String jamalaCountry=jamala.getCountry();
        boolean jamalaActiveNow=jamala.getActiveNow();
        String[] jamalaGenres=jamala.getGenres();

        System.out.println("    ");
        System.out.print(jamalaName+" , "+jamalaCountry+",  ");
        if(jamalaActiveNow=true){
            System.out.print("active"+"\ngenres: ");
        }else{
            System.out.print("retired"+"\ngenres: ");
        }
        for (String ge:genJ){
            System.out.print("  "+ge);
        }
        System.out.println("            ");

        Singer shmailyuk= new Singer();

        shmailyuk.setName("Tatiana Shmailyuk");
        shmailyuk.setActiveNow(true);
        shmailyuk.setCountry("Ukraine");
        shmailyuk.setGenres(genSh);

        String shmailyukName=shmailyuk.getName();
        boolean shmailyukActiveNow=shmailyuk.getActiveNow();
        String shmailyukCountry=shmailyuk.getCountry();
        String[] shmailyukGenres=shmailyuk.getGenres();

        System.out.println("     ");
        System.out.print(shmailyukName+", "+shmailyukCountry+", ");
        if(shmailyukActiveNow=false){
            System.out.print("active"+"\ngenres: ");
        }else{
            System.out.print("retired"+"\ngenres: ");
        }
        for (String ge:genSh){
            System.out.print("  "+ ge);
        }
        System.out.println("      ");


        Book annaKarenina=new Book();

        annaKarenina.setTitle("Anna Karenina");
        annaKarenina.setAuthor("Leo Tolstoy");
        annaKarenina.setYear(1877);
        annaKarenina.setIsFilmed(true);
        annaKarenina.setYearsOfFilms(yearOfFiAn);

        String annaKareninaTitle=annaKarenina.getTitle();
        String annaKareninaAuthor=annaKarenina.getAuthor();
        int annaKareninaYear=annaKarenina.getYear();
        boolean annaKareninaIsFilmed=annaKarenina.getIsFilmed();
        int[] annaKareninaYearsOfFilms=annaKarenina.getYearsOfFilms();



        System.out.print(annaKareninaTitle+", "+annaKareninaAuthor+", "+annaKareninaYear+", ");
        if(annaKareninaIsFilmed=true) {
            System.out.print("staged" + "\nYears staged: ");
            }else{
            System.out.print("never staged"+"\nYears staged: ");
            }
            for(int yof:yearOfFiAn) {
                System.out.print("  "+yof);
            }
        System.out.println("            ");

        Book chaika =new Book();

        chaika.setTitle("Chaika");
        chaika.setAuthor("Anton Chekhov");
        chaika.setYear(1897);
        chaika.setIsFilmed(true);
        chaika.setYearsOfFilms(yearOfFiCh);

        String chaikaTitle=chaika.getTitle();
        String chaikaAuthor=chaika.getAuthor();
        int chaikaYear=chaika.getYear();
        boolean chaikaIsFilmed=chaika.getIsFilmed();
        int[] chaikaYearsOfFilms=chaika.getYearsOfFilms();

        System.out.println("    ");
        System.out.print(chaikaTitle+", "+chaikaAuthor+", "+chaikaYear+", ");
        if(chaikaIsFilmed=true) {
            System.out.print("staged " + "\nYears staged: ");
            for (int yo : yearOfFiCh) {
                System.out.print("  " + yo);
            }
        }


        vrubel.printClassArtist();
        pollock.printClassArtist();

        jamala.printClassSinger();
        shmailyuk.printClassSinger();

        annaKarenina.printClassBook();
        chaika.printClassBook();

    }
}

