public class Homework10 {

    public static void main(String[] arg) {

     System.out.println("*** Homework 10 by Tanik ***");
     System.out.println("\nClass 1 -- Building 1 -- created using default constructor ");

     Building Ostank = new Building();

     Ostank.setName("Ostankinskaya Bashnya");
     Ostank.setHeight(10);
     Ostank.setCountry("Russia");
     Ostank.setYearBuild(1970);
     Ostank.setHighest(false);

     String bName = Ostank.getName();
     int bYear = Ostank.getYearBuild();
     int bHeight = Ostank.getHeight();
     boolean bIsHighest = Ostank.getIsHighest();

     System.out.println("\nPrinting attributes from Main --->");
     System.out.print("Building 1 -> Name: " + bName + ", Year built: " + bYear +
             ", Highest in the world?: " + bIsHighest + "\n");

     System.out.println("\nPrinting using print method defined in class: ---->");

     Ostank.printBuildingInfo();

     Building Imperial = new Building("Imperial State Building", 235, 1970, "USA", false);

     System.out.println("\nClass 1 -- Building 2 -- created with full constructor and printed with print method: --->");
     Imperial.printBuildingInfo();

     System.out.println("\nClass 2 -- School 1 -- created using full constructor ");

     School BestSchool =new School("BestSchool", 8, new String [] {"Match", "Science", "History"} );

     BestSchool.printSchoolInfo();

     System.out.println("\n\nClass 2 -- School 2 -- created using default constructor ");

     School WorstSchool=new School();

     WorstSchool.setSchoolName("Worst School");
     WorstSchool.setHighestGrade(5);
     WorstSchool.setSubjects(new String [] {"Ethics", "Literature", "Phylosofy"});

     WorstSchool.printSchoolInfo();

     System.out.println("\n\nClass 3 -- Movie 1 -- created using default constructor");

     Movie Gladiator = new Movie();

     Gladiator.setName("Gladiator");
     Gladiator.setYear(2000);
     Gladiator.setActors(new String[] {"DiCaprio", "Cloony", "Pitt"});

     Gladiator.printMovieInfo();


     System.out.println("\nClass 3 -- Movie 2 -- created using full constructor");

     Movie Aviator=new Movie("Aviator", 2002, new String[] {"Ivanov", "Petrov", "Sidorov"});

    Aviator.printMovieInfo();

    }

    }



