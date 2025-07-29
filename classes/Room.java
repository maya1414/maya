package classes;

public class Room {

    private Closet closet;
    private Bed bed;

    public Room(Closet closet, Bed bed) {
        this.closet = closet;
        this.bed = bed;
    }

    public Bed getBed() {
        return bed;
    }

    public Closet getCloset() {
        return closet;
    }
}
