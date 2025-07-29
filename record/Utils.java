package record;

public class Utils {

    public static void myInfo() {
        Student me = new Student("Maya", 10, 11);
        System.out.println(me.getInfo());
        System.out.println("in high school? " + me.isInHighSchool());
    }

}
