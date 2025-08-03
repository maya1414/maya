package lambda;

public class Main {

    public static void main(String[] args) {
        Func func = (x, y) -> countCharInString(x, y);

        Func2 func2 = (x, y) -> (int) Math.pow(Math.min(x,y), Math.max(x,y));

    }

    public static int countCharInString(String x, char y) {
        int count = 0;
        char[] x2 = x.toCharArray();
        for (int i = 0; i < x.length(); i++) {
            if (x2[i] == y) {
                count++;
            }
        }
        return count;
    }

}
