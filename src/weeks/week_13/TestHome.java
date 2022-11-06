package weeks.week_13;

public class TestHome {
    public static void main(String[] args) {
        System.out.println("Home1:");
        Home home1 = new Home(60, 1, 3, false, 400_000, 1500, "West", 1996);
        home1.print();
        System.out.println("----------------");
        System.out.println("Home2:");
        Home home2 = new Home(110, 2, 5, true, 950_000, 4000, "South", 2005);
        home2.print();
        System.out.println("----------------");
        System.out.println("Home3:");
        Home home3 = new Home(180, 3, 8, true, 1_550_000, 12_000, "North", 2010);
        home3.print();
    }
}
