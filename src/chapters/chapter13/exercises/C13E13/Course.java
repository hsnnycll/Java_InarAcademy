package chapters.chapter13.exercises.C13E13;

public class Course implements Cloneable{

    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Course course = (Course) super.clone();
        return course;
    }

}
