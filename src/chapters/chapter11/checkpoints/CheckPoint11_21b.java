package chapters.chapter11.checkpoints;

public class CheckPoint11_21b {
    public static void main(String[] args) {

        new Person1().printPerson();
        new Student1().printPerson();
    }
}
class Student1 extends Person1 {
    private String getInfo(){
        return "Student1";
    }
}

class Person1 {
    private String getInfo(){
        return "Person1";
    }

    public void printPerson(){
        System.out.println(getInfo());
    }
}