package chapters.chapter11.exercises.C11E02;

public class Faculty extends Employee{

    private String hours;
    private String rank;

    public Faculty() {
    }

    public Faculty(String hours, String rank) {
        this.hours = hours;
        this.rank = rank;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString(){
        return "Faculty Class: Name: " + this.getName();
    }
}
