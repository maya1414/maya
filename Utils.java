public class Utils {

    public int daysBeforeInYear(Month month, int dayInMonth) {
        int totalDays = 0;
        int index = 0;
        while (Month.values()[index] != month) {
            totalDays += Month.values()[index].days;
            index++;
        }
        return totalDays + (dayInMonth - 1);
    }

}
