package weeks.week_12;

public class Student {
    private static int studentCounter;
    private String name;
    private String lastname;
    private int id;
    private String email;


    public Student() {
        this("", "", 0, "");
    }

    public Student(String name, String lastname, int id, String email) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.email = email;
        studentCounter++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("LastName: " + this.lastname);
        System.out.println("Id: " + this.id);
        System.out.println("Email: " + this.email);
        System.out.println("----------------------------");
    }

    public static int getStudentCounter(){
        return studentCounter;
    }
}
