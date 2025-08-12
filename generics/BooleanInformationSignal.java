package generics;

import java.util.ArrayList;

public class BooleanInformationSignal implements InformationSigna<Boolean> {

    private static ArrayList<Boolean> booleanArr;

    public BooleanInformationSignal(ArrayList<Boolean> arr) {
        booleanArr = arr;
    }

    @Override
    public Boolean getTheLatestValue() {
        try {
            return booleanArr.get(booleanArr.size() - 1);
        } catch (Exception e) {
            System.out.println("This arr is empty");
        }
        return null;
    }

    @Override
    public void update(Boolean item) {
        booleanArr.add(item);
    }

    @Override
    public Boolean[] asArray() {
        return (Boolean[]) booleanArr.toArray();
    }
}
