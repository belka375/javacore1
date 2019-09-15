package hw8;

public class Coffee {

        public String name;
        public String country;
        public String roast;
        public double size;
        public Boolean isDecaff;



        public void printInfo(){
            if(isDecaff) {
                System.out.println("Name: "+name+"\nCountry of Origin: "+country+"\nRoast: "+roast+"\nBag size: "+size+" oz "+"\nDecaff");
            }else{
                System.out.println("Name: "+name+"\nCountry of Origin: "+country+"\nRoast: "+roast+"\nBag size: "+size+" oz");
            }
        }



}
