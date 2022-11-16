package chapters.chapter11.exercises.C11E02;

public class Student extends Person {

    private int classStatus;
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;

    public Student() {

    }

    public Student(int classStatus) {
        this.classStatus = classStatus;
    }

    public int getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(int classStatus) {
        this.classStatus = classStatus;
    }

    @Override
    public String toString(){
        return "Student class: Name: " + this.getName();
    }
}
