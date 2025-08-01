package classes;

public class Bed {

    private double hight;
    private int pillows;
    private String sheetsColor;
    private double price;

    public Bed(double hight, int pillows, String sheetsColor, double price) {
        this.hight = hight;
        this.pillows = pillows;
        this.sheetsColor = sheetsColor;
        this.price = price;
    }

    public Bed(String sheetsColor, double hight) {
        this(hight, MayaConstants.NUM_OF_PILLOWS, sheetsColor, MayaConstants.DEFAULT_BED_PRICE);
    }

    public double getPrice() {
        return price;
    }

    public int getPillows() {
        return pillows;
    }

    public double getHigh() {
        return hight;
    }

    public String getSheetsColor() {
        return sheetsColor;
    }

    public void changeSheetsColor(String color) {
        this.sheetsColor= color;
    }
}
