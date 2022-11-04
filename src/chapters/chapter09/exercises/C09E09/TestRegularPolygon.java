package chapters.chapter09.exercises.C09E09;

public class TestRegularPolygon {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        System.out.println(polygon1);
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        System.out.println(polygon2);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println(polygon3);
    }
}
