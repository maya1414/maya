package classes;

public class Closet {

    private Shirt[] shirts;

    public Closet(Shirt[] shirts) {
        this.shirts = shirts;
    }

    public Shirt[] getShirts() {
        return shirts;
    }

    public Shirt[] getShirtsBySize(int size) {
        int count = 0;
        for (int i = 0; i < shirts.length; i++) {
            if (shirts[i].sizeOfShirt == size) {
                count++;
            }
        }
        Shirt[] shirtsBySize = new Shirt[count];
        int index = 0;
        for (int i = 0; i < shirts.length; i++) {
            if (shirts[i].sizeOfShirt == size) {
                shirtsBySize[index] = shirts[i];
                index++;
            }
        }
        return shirtsBySize;
    }

    public void addShirt(Shirt newShirt){
        this.shirts = ClosetUtils.addToArray(shirts , newShirt);
    }

}
