package classes;

public class Utils {

    protected static Shirt[] addToArray(Shirt[] array, Shirt newItem) {
        Shirt[] newArray = new Shirt[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = newItem;
        return newArray;
    }

    public static boolean isNear(double value, double target, double tolerance) {
        return Math.abs(value - target) <= tolerance;
    }

}
