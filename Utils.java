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

    public Month whatMonthIsIt(int days) {
        int dayTotal =0;
        for (Month month : Month.values()) {
            dayTotal += month.days;
            if (days<= dayTotal) {
                return month;
            }
        }
        return null;
    }

}
