package generics;

import java.util.ArrayList;

public class IntInformationSignal implements InformationSigna<Integer> {

    private static ArrayList<Integer> intArr;

    public IntInformationSignal(ArrayList<Integer> arr) {
        intArr = arr;
    }

    @Override
    public Integer getTheLatestValue() {
        if (intArr.getLast() == null) {
            System.out.println("This arr is empty");
            return null;
        }
        return intArr.getLast();
    }

    @Override
    public void update(Integer item) {
        intArr.add(item);
    }

    @Override
    public Integer[] asArray() {
        return intArr.toArray(new Integer[0]);
    }

}
