package hw14_1;

import java.time.LocalDateTime;

public class Member extends CostcoPerson {
        private Membership membership;

        public Member(String name, String lastName, LocalDateTime dob, Membership membership){
            super(name, lastName, dob);
            this.membership=membership;
        }

//        public Membership getMembership() {
//            return membership;
//        }

        public void printMember(){
            printCostcoPerson();
            System.out.println("Membership status: "+membership);
        }

}
