package hw14_1;

public class Costco {

    private String name;
    private Address address;
    private String phoneNumber;
    private Member member;
    private Crew crew;
    private Department[] departments;
    private Boolean isBusiness;


    public Costco(String name, Address address, String phoneNumber, Member member, Crew crew, Department[] departments, Boolean isBusiness){
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.member=member;
        this.crew=crew;
        this.departments=departments;
        this.isBusiness=isBusiness;
    }


    public String getName() {
        return name;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public Member getMember() {
        return member;
    }

    public Crew getCrew() {
        return crew;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Boolean getBusiness() {
        return isBusiness;
    }

    public Address getAddress() {
        return address;
    }

    public void printCostcoInfo(){

        System.out.println(name);
        address.printAddress();
        System.out.println(phoneNumber);
        System.out.print("Departments: ");
        for (Department dep:departments) {
            System.out.print(dep+" ");

        }
        System.out.println("------------------");
        crew.printCrew();
        member.printMember();


        if(isBusiness){
            System.out.println("Business Center");
        }else{
            System.out.println("Wholesale");
        }

    }




}
