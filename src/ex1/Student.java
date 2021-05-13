package ex1;

import java.util.Objects;

public class Student {
    private final String name;
    private final int grades;

    public Student(String name, int grades){
        this.name=name;
        this.grades=grades;
    }

    public String getName() {
        return name;
    }

    public int getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return grades == student.grades && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grades);
    }
}
