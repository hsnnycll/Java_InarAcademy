package chapters.chapter11.exercises.C11E02;

public class Staff extends Employee{

    private String title;

    public Staff() {
    }

    public Staff(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return "Staff Class: Name: " + this.getName();
    }
}
