package chapters.chapter10.exercises.C10E09;

public class Course {

    private String name;
    private String[] students;
    private int numberOfStudents;

    public Course(String name) {
        this.name = name;
        students = new String[10];
    }

    public String getName() {
        return name;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] tempStudentList = new String[students.length * 2];
            System.arraycopy(students, 0, tempStudentList, 0, students.length);
            students = tempStudentList;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equalsIgnoreCase(student)){
                if (i == students.length - 1) {
                    students[i] = null;
                    numberOfStudents--;
                }else {
                    for (int j = i + 1; j < numberOfStudents; j++) {
                        students[j - 1] = students[j];
                    }
                    students[numberOfStudents] = null;
                    numberOfStudents--;
                }
            }
        }
    }

    public int findStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(student)) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        students = new String[10];
        numberOfStudents = 0;
    }

    public void displayStudents(){
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(students[i]);
        }
    }
}
