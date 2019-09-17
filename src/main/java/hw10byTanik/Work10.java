package hw10byTanik;

public class Work10 {

    public static void main(String[] arg) {

     System.out.println("*** Homework 10 by Tanik ***");
     System.out.println("\nClass 1 -- Building 1 -- created using default constructor ");

     Building ostank = new Building();

     ostank.setName("Ostankinskaya Bashnya");
     ostank.setHeight(10);
     ostank.setCountry("Russia");
     ostank.setYearBuild(1970);
     ostank.setHighest(false);

     String bName =  ostank.getName();
     int bYear =  ostank.getYearBuild();
     int bHeight =  ostank.getHeight();
     boolean bIsHighest = ostank.getIsHighest();

     System.out.println("\nPrinting attributes from Main --->");
     System.out.print("Building 1 -> Name: " + bName + ", Year built: " + bYear +
             ", Highest in the world?: " + bIsHighest + "\n");

     System.out.println("\nPrinting using print method defined in class: ---->");

     ostank.printBuildingInfo();

     Building imperial = new Building("Imperial State Building", 235, 1970, "USA", false);

     System.out.println("\nClass 1 -- Building 2 -- created with full constructor and printed with print method: --->");
     imperial.printBuildingInfo();

     System.out.println("\nClass 2 -- hw10byTanik.School 1 -- created using full constructor ");

     School bestSchool =new School("BestSchool", 8, new String [] {"Match", "Science", "History"} );

     bestSchool.printSchoolInfo();

     System.out.println("\n\nClass 2 -- hw10byTanik.School 2 -- created using default constructor ");

     School worstSchool=new School();

     worstSchool.setSchoolName("Worst hw10byTanik.School");
     worstSchool.setHighestGrade(5);
     worstSchool.setSubjects(new String [] {"Ethics", "Literature", "Phylosofy"});

     worstSchool.printSchoolInfo();

     System.out.println("\n\nClass 3 -- hw10byTanik.Movie 1 -- created using default constructor");

     Movie gladiator = new Movie();

     gladiator.setName("Gladiator");
     gladiator.setYear(2000);
     gladiator.setActors(new String[] {"DiCaprio", "Cloony", "Pitt"});

     gladiator.printMovieInfo();


     System.out.println("\nClass 3 -- hw10byTanik.Movie 2 -- created using full constructor");

     Movie aviator=new Movie("Aviator", 2002, new String[] {"Ivanov", "Petrov", "Sidorov"});

    aviator.printMovieInfo();

    }

    }



