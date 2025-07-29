package classes;

public class Room {

    private Closet closet;
    private Bed bed;

    public Room(Closet closet, Bed bed) {
        this.closet = closet;
        this.bed = bed;
    }

    public Room(Bed bed, Shirt[] shirts) {
        this.bed = bed;
        this.closet = new Closet(shirts);
    }

    public Bed getBed() {
        return bed;
    }

    public Closet getCloset() {
        return closet;
    }
}
