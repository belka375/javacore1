package hw14_2;

public class Gym {

    private String name;
    private Address address;
    private Member member;
    private Coach coach;
    private Pool pool;

    public Gym(String name, Address address, Member member, Coach coach, Pool pool) {
        this.name = name;
        this.address = address;
        this.member = member;
        this.coach = coach;
        this.pool = pool;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public Member getMember() {
        return member;
    }

    public Pool getPool() {
        return pool;
    }

    public Coach getCoach() {
        return coach;
    }

    public void printGymInfo(){
        System.out.println(name);
        address.printAddress();
        pool.printPool();

        member.printMember();
        coach.printCoach();

    }

}
