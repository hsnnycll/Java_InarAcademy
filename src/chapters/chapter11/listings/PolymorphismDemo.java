package chapters.chapter11.listings;

import chapters.chapter11.listings.geometricObject.CircleFromSimpleGeometricObject;
import chapters.chapter11.listings.geometricObject.RectangleFromSimpleGeometricObject;
import chapters.chapter11.listings.geometricObject.SimpleGeometricObject;

public class PolymorphismDemo {
    public static void main(String[] args) {

        displayObject(new CircleFromSimpleGeometricObject(1, "red", false));
        displayObject(new RectangleFromSimpleGeometricObject(1, 1, "black", true));
    }

    public static void displayObject(SimpleGeometricObject object){
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
    }
}
