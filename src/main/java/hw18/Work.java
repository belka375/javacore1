package hw18;

public class Work {
    public static void main(String[]args){
        InsuranseCompanies[]ins=new InsuranseCompanies[]{InsuranseCompanies.AETNA,InsuranseCompanies.BlueCross};
        InsuranseCompanies[] ins1 = new InsuranseCompanies[]{InsuranseCompanies.UnitedHealthCare,InsuranseCompanies.BlueCross};
        Address addr=new Address("4551 millenia", "Orlando", "FL", 32839, ins);
        Address addr1=new Address("5551 Vanguard", "Orlando", "FL", 32819, ins1);

   

        addr.printInfo();
        addr1.printInfo();
    }
}
