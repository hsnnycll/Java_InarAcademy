package chapters.chapter11.exercises.C11E02;

public class Test {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Richard");
        Student student = new Student();
        student.setName("Kevin");
        Employee employee = new Employee();
        employee.setName("David");
        Faculty faculty = new Faculty();
        faculty.setName("Garry");
        Staff staff = new Staff();
        staff.setName("Alice");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);

    }
}
