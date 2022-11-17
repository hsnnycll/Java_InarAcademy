package chapters.chapter11.exercises.C11E05;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public void dropStudent(String student){
        if(students.contains(student)){
            students.remove(student);
            System.out.println(student + " is dropped");
        }else{
            System.out.println("There is no student with this name.");
        }
    }
}
