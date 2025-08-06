package generics;

import java.util.ArrayList;

public class IntInformationSignal implements InformationSigna<Integer> {

    private static ArrayList<Integer> intArr;

    public IntInformationSignal(ArrayList<Integer> arr) {
        intArr = arr;
    }

    @Override
    public Integer getTheLatestValue() {
        return intArr.get(intArr.size() - 1);
    }

    @Override
    public void update(Integer item) {
        intArr.add(item);
    }

    @Override
    public Integer[] asArray() {
        Integer[] arr = new Integer[intArr.size()];
        for (int i = 0; i < intArr.size(); i++) {
            arr[i] = intArr.get(i);
        }
        return arr;
    }

}
