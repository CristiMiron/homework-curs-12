package ex1;

import java.util.*;

public class StudentService {
    private final List<Student> students = new ArrayList<>();

    public StudentService(Collection<Student> students) {
        this.students.addAll(students);
    }

    public List<Student> getStudents() {
        return students;
    }

    public Map<String, Integer> mapNameToGrades() {
        Map<String, Integer> result = new HashMap<>();
        for (Student student : students) {
            result.put(student.getName(), student.getGrades());
        }
        return result;
    }

}