package classes;

public class Main {
    public static void main(String[] args) {

        Bed bed = new Bed(200.0, 4, "gray", 20000);

        bed.changeSheetsColor(MayaConstants.FAVORITE_COLOR);

        Shirt[] shirts = {
                new Shirt(38, "white"),
                new Shirt(36, "blue"),
                new Shirt(40, "green"),
                new Shirt(38, "blue"),
                new Shirt(36, "blue"),
                new Shirt(40, "pink")
        };

        Room room = new Room(bed, shirts);

        Closet closet = new Closet(shirts);

        for (int i = 0; i < closet.getShirtsBySize(MayaConstants.SHIRT_EU_SIZE).length; i++) {
            System.out.print(closet.getShirtsBySize(MayaConstants.SHIRT_EU_SIZE)[i].color + " ");
        }
        System.out.println();
        System.out.println(Utils.isNear(bed.getPrice(), MayaConstants.MAX_PRICE_FOR_BED, MayaConstants.TOLERANCE));

    }
}
