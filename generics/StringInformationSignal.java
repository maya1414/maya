package generics;

import java.util.ArrayList;

public class StringInformationSignal implements InformationSigna<String> {

    private static ArrayList<String> stringsArr;

    public StringInformationSignal(ArrayList<String> arr) {
        stringsArr = arr;
    }

    @Override
    public String getTheLatestValue() {
        try {
            return stringsArr.get(stringsArr.size() - 1);
        } catch (Exception e) {
            System.out.println("This arr is empty");
        }
        return null;
    }

    @Override
    public void update(String item) {
        stringsArr.add(item);
    }

    @Override
    public String[] asArray() {
        return (String[]) stringsArr.toArray();
    }
}
