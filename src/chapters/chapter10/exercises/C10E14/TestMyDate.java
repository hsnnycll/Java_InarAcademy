package chapters.chapter10.exercises.C10E14;

public class TestMyDate {
    public static void main(String[] args) {

        MyDate date1 = new MyDate();
        System.out.println(date1.getYear() + "/" + date1.getMonth() + "/" + date1.getDay());

        MyDate date2 = new MyDate(34355555133101L);
        System.out.println(date2.getYear() + "/" + date2.getMonth() + "/" + date2.getDay());
    }
}
