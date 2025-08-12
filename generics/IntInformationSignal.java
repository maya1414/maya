package generics;

import java.util.ArrayList;

public class IntInformationSignal implements InformationSigna<Integer> {

    private static ArrayList<Integer> intArr;

    public IntInformationSignal(ArrayList<Integer> arr) {
        intArr = arr;
    }

    @Override
    public Integer getTheLatestValue() {
        try {
            return intArr.get(intArr.size() - 1);
        } catch (Exception e) {
            System.out.println("This arr is empty");
        }
        return null;
    }

    @Override
    public void update(Integer item) {
        intArr.add(item);
    }

    @Override
    public Integer[] asArray() {
        return (Integer[])intArr.toArray();
    }

}
