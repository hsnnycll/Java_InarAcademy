package chapters.chapter10.exercises.C10E09;

public class TestCourse {
    public static void main(String[] args) {
        Course course = new Course("Course of Java");
        course.addStudent("John");
        course.addStudent("Julie");
        course.addStudent("Christine");
        course.displayStudents();
        course.dropStudent("John");
        course.displayStudents();
    }
}
