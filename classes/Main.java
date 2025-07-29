package classes;

public class Main {
    public static void main(String[] args) {

        Bed bed = new Bed("gray", 200);

        bed.changeColorSheets(MayaConstants.color);

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

        for (int i = 0; i < closet.getShirtsBySize(MayaConstants.size).length; i++) {
            System.out.print(closet.getShirtsBySize(MayaConstants.size)[i].colorOfShirt + " ");
        }

    }
}
