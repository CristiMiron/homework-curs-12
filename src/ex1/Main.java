package ex1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService(List.of(
                new Student("Cristi",8),
                new Student("Amalia",9),
                new Student("Alex",10),
                new Student("Roxana",7),
                new Student("Nicu",4)
        ));

        System.out.println(service.mapNameToGrades());
        System.out.println(service);

    }
}
