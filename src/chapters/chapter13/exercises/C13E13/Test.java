package chapters.chapter13.exercises.C13E13;

import java.util.Arrays;
import java.util.Objects;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        Course course = new Course("OOP");
        course.addStudent("Peter Jones");
        course.addStudent("Kim Smith");
        course.addStudent("Anne Kennedy");

        Course course1 = (Course) course.clone();
        System.out.println(Objects.equals(course1.getCourseName(), course.getCourseName()));
        System.out.println(course.getStudents() == course1.getStudents());

    }
}
