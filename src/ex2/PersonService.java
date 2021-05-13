package ex2;

import java.util.*;
import java.util.stream.Collectors;

public class PersonService {
    private final List<Person> persons = new ArrayList<>();

    public PersonService(Collection<Person> persons) {
        if (persons != null) {
            this.persons.addAll(persons);
        }
    }

    public List<Person> getPersons() {
        return persons;
    }

    public List<String> getPersonNames() {
        List<String> result = new ArrayList<>();
        for (Person person : persons) {
            result.add(person.getName());
        }
        return result;
    }

    public Map<String, Integer> mapNameToAge() {
        Map<String, Integer> result = new HashMap<>();
        for (Person person : persons) {
            result.put(person.getName(), person.getAge());
        }
        return result;
    }

    public List<Person> personsFromGivenAge() {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getAge() > 36) {
                result.add(person);
            }
        }
        return result;
    }

    public Map<String, List<String>> getNamesFromHairColour() {
        Map<String, List<String>> result = new HashMap<>();
        for (Person person : persons) {
            List<String> hairList = result.get(person.getHairColour());
            if (hairList == null) {
               hairList = new ArrayList<>();
            }
            hairList.add(person.getName());
            result.put(person.getHairColour(), hairList);
        }
        return result;
    }

    public Map<Integer, List<Person>> mapAgeToPersons() {
        Map<Integer, List<Person>> result = new HashMap<>();
        for (Person person : persons){
            List<Person> personList = result.get(person.getAge());
            if(personList == null){
                personList = new ArrayList<>();
            }
            personList.add(person);
            result.put(person.getAge(),personList);
        }
        return result;
    }
}

