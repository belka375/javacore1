package homeWorl10;

public class Work {
    public static void main(String[] args) {


       String [] address = {"Dave", "Davidson", "12 Main St.", "Unit 3107", "Chicago", "IL"};
       Account bankaccount =new Account (000367756432 ,200.75 , 234594322 ,"David",8349, address);

       String [] model ={"A-Class","C-Class" ,"G-Class","E-Class", "S-Class" };
       Vehicle myVehhicle =new Vehicle ( "Mercedes-Benz", "Black", model);

       bankaccount.printAccountInfo();
       myVehhicle.printVehicle();

    }
}
