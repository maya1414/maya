package classes;

public class Bed {

    private double high;
    private int pillows;
    private String colorSheets;
    private double price;

    public Bed(double high, int pillows, String color, double price) {
        this.high = high;
        this.pillows = pillows;
        this.colorSheets = color;
        this.price = price;
    }

    public Bed(String color, double high) {
        this.high = high;
        this.colorSheets = color;
        this.pillows = 1;
    }

    public double getPrice() {
        return price;
    }

    public int getPillows() {
        return pillows;
    }

    public double getHigh() {
        return high;
    }

    public String getColorSheets() {
        return colorSheets;
    }

    public void changeColorSheets(String color) {
        this.colorSheets = color;
    }
}
