package generics;

import java.util.ArrayList;

public class StringInformationSignal implements InformationSigna<String> {

    private static ArrayList<String> stringsArr;

    public StringInformationSignal(ArrayList<String> arr) {
        stringsArr = arr;
    }

    @Override
    public String getTheLatestValue() {
        if (stringsArr.getLast() == null) {
            System.out.println("This arr is empty");
            return null;
        }
        return stringsArr.getLast();
    }

    @Override
    public void update(String item) {
        stringsArr.add(item);
    }

    @Override
    public String[] asArray() {
        return stringsArr.toArray(new String[0]);    }
}
