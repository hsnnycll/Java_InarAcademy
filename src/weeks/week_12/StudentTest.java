package weeks.week_12;

public class StudentTest {
    public static void main(String[] args) {

        Student haluk = new Student("Haluk", "Dundar", 425, "haluk@inar.com");
        haluk.print();
        haluk.setEmail("haluk@gmail.com");
        haluk.print();

        Student murat = new Student();
        murat.print();
        murat.setName("Murat");
        murat.setLastname("Inar");
        murat.print();

        System.out.println("Student numer = " + Student.getStudentCounter());

        Student nurullah = new Student("Nurullah", "Inar", 526, "nurullah@inar.com");
        System.out.println("Student number = " + Student.getStudentCounter());
    }
}
