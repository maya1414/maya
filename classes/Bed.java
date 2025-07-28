package classes;

import java.awt.*;

public class Bed {

    private double high;
    private int pillows;
    private Color colorSheets;
    private double price;

    public Bed(double high, int pillows, Color color, double price) {
        this.high = high;
        this.pillows = pillows;
        this.colorSheets = color;
        this.price = price;
    }

    public Bed(Color color, double high) {
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

    public Color getColorSheets() {
        return colorSheets;
    }

    public void changeColorSheets(Color color) {
        this.colorSheets = color;
    }
}
