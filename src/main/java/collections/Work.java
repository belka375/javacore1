package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Work {
    public static void main(String[] args) {
        Person person;
        //более современная форма записи с var - какой угодно тип переменной
        var list = new ArrayList<String>();
        //это более старая версия
        ArrayList<Person> list1 = new ArrayList<Person>();

        list1.add(new Person(15, "JOhn"));
        list1.add(new Person(20, "JOhn"));
        list1.add(new Person(16, "Mike"));
        list1.add(new Person(25, "Jason"));
        list1.add(new Person(35, "Bob"));

        for (var i = 0; i < list1.size(); i++) {
            person = list1.get(i);
            System.out.println(person.getName());
        }

        for (Person person1 : list1) {
            System.out.println(person1.getName());
        }

        //вывести сех людей сташше 18 лет

        for (var i = 0; i < list1.size(); i++) {
            person = list1.get(i);
            if (person.getAge() > 18) {

                System.out.println(person.getName());
            }
        }


        System.out.println("*****************");
        for (Person person2 : list1) {
            if (person2.getAge() > 18) {
                System.out.println(person2.getName());
            }
        }
        System.out.println("*****************");
        list1.stream().filter(person3 -> person3.getAge() > 18)
                .forEach(person3 -> System.out.println(person3.getName()));

        System.out.println("*****************");

        var org=new Organization("Super company","1 Highay,LA,CA");
        org.addBranche(new Branch(1,"NY,NY"));
        org.addBranche(new Branch(2,"LA,CA"));
        org.addBranche(new Branch(3,"TN,TN"));
        org.addBranche(new Branch(4,"TUI,NY"));
        org.addBranche(new Branch(5,"WASHINGTON,DC"));
        org.addBranche(new Branch(6,"NY,NY"));
        org.addBranche(new Branch(7,"DENVER,CO"));

        List<Branch>  branches = org.getBranches();

        List<String> addresses = branches.stream().map(branch->branch.getAddress())
                .collect(Collectors.toList());



        System.out.println("*****************");

        List<String> addressesNY = branches.stream()
                .map(branch->branch.getAddress())
                .filter(y->y=="NY,NY")

                //use collect at the end of steam

                .collect(Collectors.toList());



        addresses.forEach(ad->System.out.println(ad));
        System.out.println("*****************");
        addressesNY.forEach(ad->System.out.println(ad));

        var r=branches.stream()
                .anyMatch(x->x.getNumber()==7);
        System.out.println(r);






    }
}


