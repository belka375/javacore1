package hw14;

public class Work {
    public static void main (String [] args){


        Address address=new Address();
        address.Address("24 Paseo Verde","Nevada", 89012,"Las Vegas");

        Menu [] m =new Menu[]{Menu.BREAKFAST,Menu.BRUNCH,Menu.LUNCH,Menu.DINNER};

        Servers servers=new Servers();
        servers.Servers("Aimee", 25);
        servers.Servers("Anthony", 27);

        Restaurant r = new Restaurant();
        r.Restaurant("Cheesecake Factory",address,m,servers);

        String r1 = r.getAddress().getCity();
        System.out.println(r1);

        String s  = r.getServers().getName();
        System.out.println(s);













    }
}
