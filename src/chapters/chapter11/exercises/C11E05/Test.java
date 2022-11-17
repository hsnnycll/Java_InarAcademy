package chapters.chapter11.exercises.C11E05;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        ArrayList students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students.get(i) + ", ");
        }

        System.out.println();
        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());

        course1.dropStudent("Kim Smith");
    }
}

