package generics;

import java.util.ArrayList;

public class BooleanInformationSignal implements InformationSigna<Boolean> {

    private static ArrayList<Boolean> booleanArr;

    public BooleanInformationSignal(ArrayList<Boolean> arr) {
        booleanArr = arr;
    }

    @Override
    public Boolean getTheLatestValue() {
        if (booleanArr.get(booleanArr.size()-1) == null) {
            System.out.println("This arr is empty");
            return null;
        }
        return booleanArr.get(booleanArr.size() - 1);
    }

    @Override
    public void update(Boolean item) {
        booleanArr.add(item);
    }

    @Override
    public Boolean[] asArray() {
        return booleanArr.toArray(new Boolean[0]);
    }
}
