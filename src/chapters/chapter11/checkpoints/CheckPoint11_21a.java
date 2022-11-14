package chapters.chapter11.checkpoints;

public class CheckPoint11_21a {
    public static void main(String[] args) {

        new Person().printPerson();
        new Student().printPerson();
    }
}

class Student extends Person {
    @Override
    public String getInfo(){
        return "Student";
    }
}

class Person {
    public String getInfo(){
        return "Person";
    }

    public void printPerson(){
        System.out.println(getInfo());
    }
}
