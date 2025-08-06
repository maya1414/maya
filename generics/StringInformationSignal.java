package generics;

import java.util.ArrayList;

public class StringInformationSignal implements InformationSigna<String> {

    private static ArrayList<String> stringsArr;

    public StringInformationSignal(ArrayList<String> arr) {
        stringsArr = arr;
    }

    @Override
    public String getTheLatestValue() {
        return stringsArr.get(stringsArr.size() - 1);
    }

    @Override
    public void update(String item) {
        stringsArr.add(item);
    }

    @Override
    public String[] asArray() {
        String[] arr = new String[stringsArr.size()];
        for (int i = 0; i < stringsArr.size(); i++) {
            arr[i] = stringsArr.get(i);
        }
        return arr;
    }
}
