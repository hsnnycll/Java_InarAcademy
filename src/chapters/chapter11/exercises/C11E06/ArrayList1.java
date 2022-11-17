package chapters.chapter11.exercises.C11E06;

import java.util.ArrayList;
import java.util.Date;
import chapters.chapter10.listings.loan.Loan;
import chapters.chapter11.listings.geometricObject.CircleFromSimpleGeometricObject;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();
        list.add(new Loan());
        list.add(new Date());
        list.add(new CircleFromSimpleGeometricObject());
        list.add("hope");

        for (Object o:list) {
            System.out.println(o.toString());
        }
    }
}
