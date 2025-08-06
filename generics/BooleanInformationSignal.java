package generics;

import java.util.ArrayList;

public class BooleanInformationSignal implements InformationSigna<Boolean> {

    private static ArrayList<Boolean> booleanArr;

    public BooleanInformationSignal(ArrayList<Boolean> arr) {
        booleanArr = arr;
    }

    @Override
    public Boolean getTheLatestValue() {
        return booleanArr.get(booleanArr.size() - 1);
    }

    @Override
    public void update(Boolean item) {
        booleanArr.add(item);
    }

    @Override
    public Boolean[] asArray() {
        Boolean[] arr = new Boolean[booleanArr.size()];
        for (int i = 0; i < booleanArr.size(); i++) {
            arr[i] = booleanArr.get(i);
        }
        return arr;
    }
}
