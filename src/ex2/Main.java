package ex2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonService service = new PersonService(List.of(
                new Person("Cristi",36,"brown"),
                new Person("Gabi",36,"blonde"),
                new Person("Cipri",25,"red"),
                new Person("Clara",45,"black"),
                new Person("Corina",29,"blonde"),
                new Person("George",40,"brown")
        ));

        System.out.println(service.getPersons());
        System.out.println(service.getPersonNames());
        System.out.println(service.mapNameToAge());
        System.out.println(service.personsFromGivenAge());
        System.out.println(service.getNamesFromHairColour());
        System.out.println(service.mapAgeToPersons());

    }
}
