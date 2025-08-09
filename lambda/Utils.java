package lambda;

public class Utils {

    CharInString charInString = (x, y) -> x.indexOf(y)!= -1;

    PowerOfTheLarger func2 = (x, y) -> (int)Math.pow(Math.min(x,y) , Math.max(x,y));

}
