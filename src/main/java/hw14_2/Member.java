package hw14_2;

import java.time.LocalDateTime;

public class Member extends GymPerson{
    private Membership membership;
    private Boolean isOverweight;

    public Member(String firstName, String lastName, LocalDateTime dob, Membership membership, Boolean isOverweight){
        super(firstName, lastName, dob);
        this.membership=membership;
        this.isOverweight=isOverweight;
    }

    public Membership getMembership() {
        return membership;
    }

    public Boolean getOverweight() {
        return isOverweight;
    }

    public void printMember(){
        System.out.println("--------------------------");
        printGymPerson();
        System.out.println("Membership: "+membership);
        if(isOverweight){
            System.out.println("Aim: loose weight");
        }else{
            System.out.println("Aim: gain weight");
        }
    }

}
