package dataStructures;

import java.util.*;

public class DataStructures {

    public static void sortingNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter");
        String num = input.next();
        boolean numberWasEntered = false;
        ArrayList<Number> arr = new ArrayList<>();
        ArrayList<Number> arr2 = new ArrayList<>();
        while (!num.equals("q")) {
            int number = Integer.parseInt(num);
            if (number % 10 == 0) {
                arr.add(number);
            }
            arr2.add(number);
            num = input.next();
        }
        System.out.print("Enter number to check ");
        Number check = Integer.parseInt(input.next());
        for (Number number : arr2) {
            if (number.equals(check)) {
                numberWasEntered = true;
            }
        }
        System.out.println(numberWasEntered);
        System.out.println(arr);
    }

    public static Map<Character, Integer> createAlphabetMap() {
        Map<Character, Integer> map = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {
            map.put(alphabet.charAt(i), i + 1);
        }
        return map;
    }

    public static void sorting(List<Integer> numbers) {
        for (int i = 1; i < numbers.size(); i++) {
            int currentValue = numbers.get(i);
            int sortedIndex = i - 1;
            while (sortedIndex >= 0 && numbers.get(sortedIndex) > currentValue) {
                numbers.set(sortedIndex + 1, numbers.get(sortedIndex));
                sortedIndex--;
            }
            numbers.set(sortedIndex + 1, currentValue);
        }
    }

    public static void main(String[] args) {
        Map<Character, Integer> originalAlphabetMap = createAlphabetMap();
        SimpleMap<Character, Integer> simpleAlphabetMap = new SimpleMap<>();
        originalAlphabetMap.forEach((key, value) -> simpleAlphabetMap.put(key, value));
        System.out.println(simpleAlphabetMap.getInOrder());
    }

}
