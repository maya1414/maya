package classes;

public class Main {
    public static void main(String[] args) {

        Bed bed = new Bed("gray", 200);

        Shirt[] shirts = {
                new Shirt(38, "white"),
                new Shirt(36, "blue"),
                new Shirt(40, "green"),
                new Shirt(38, "blue"),
                new Shirt(36, "blue"),
                new Shirt(40, "pink")
        };

        Room room = new Room(bed, shirts);

    }
}
