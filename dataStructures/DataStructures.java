package dataStructures;

import java.util.*;

public class DataStructures {

    public static void sortingNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter");
        String num = input.next();
        ArrayList<Number> arr = new ArrayList<>();
        HashSet<Number> arr2 = new HashSet<>();
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
        System.out.println(arr2.contains(check));
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
            int toInsert = numbers.get(i);
            int sortedIndex = i - 1;
            while (sortedIndex >= 0 && numbers.get(sortedIndex) > toInsert) {
                numbers.set(sortedIndex + 1, numbers.get(sortedIndex));
                sortedIndex--;
            }
            numbers.set(sortedIndex + 1, toInsert);
        }
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(7);
        System.out.println(list);
        sorting(list);

        Map<Character, Integer> originalAlphabetMap = createAlphabetMap();
        SimpleMap<Character, Integer> simpleAlphabetMap = new SimpleMap<>();
        originalAlphabetMap.forEach((key, value) -> simpleAlphabetMap.put(key, value));
        System.out.println(simpleAlphabetMap.getInOrder());
    }

}
