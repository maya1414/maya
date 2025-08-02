package classes;

public class Bed {

    private final double height;
    private int pillows;
    private String sheetsColor;
    private double price;

    public Bed(double height, int pillows, String sheetsColor, double price) {
        this.height = height;
        this.pillows = pillows;
        this.sheetsColor = sheetsColor;
        this.price = price;
    }

    public Bed(String sheetsColor, double height) {
        this(height, MayaConstants.NUM_OF_PILLOWS, sheetsColor, MayaConstants.DEFAULT_BED_PRICE);
    }

    public double getPrice() {
        return price;
    }

    public int getPillows() {
        return pillows;
    }

    public double getHigh() {
        return height;
    }

    public String getSheetsColor() {
        return sheetsColor;
    }

    public void changeSheetsColor(String color) {
        this.sheetsColor= color;
    }
}
