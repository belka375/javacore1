package hw14_1;

import java.time.LocalDateTime;

public class Homework {
        public static void main(String[] args) {

            Department[] burbankDepartments=new Department[]{Department.BAKERY,Department.BABY, Department.CLOTHES};
            Address burbankAddress= new Address(101, "Main street", "Los Angeles", "CA", 90002);

            Member ivanPetrov=new Member("Ivan", "Petrov", LocalDateTime.of(1976,2,3,0,0,0,0),Membership.GOLDEN);
            Crew vasyaBobrov=new Crew("Vasily", "Bobrov", LocalDateTime.of(1980,2,3,0,0,0,0),"cashier", 16);



            Costco costco1=new Costco("Burbank", burbankAddress, "213-234-34-34", ivanPetrov, vasyaBobrov,burbankDepartments, false);
            costco1.printCostcoInfo();




        }
}


