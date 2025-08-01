package classes;

public class Closet {

    private Shirt[] shirts;

    public Closet(Shirt[] shirts) {
        this.shirts = shirts;
    }

    public Shirt[] getShirts() {
        return shirts;
    }

    public int countShirtsBySize(int size) {
        int matchingSizeCount = 0;
        for (int i = 0; i < shirts.length; i++) {
            if (shirts[i].size == size) {
                matchingSizeCount++;
            }
        }
        return matchingSizeCount;
    }

    public Shirt[] getShirtsBySize(int size) {
        int matchingSizeCount = countShirtsBySize(size);
        Shirt[] shirtsBySize = new Shirt[matchingSizeCount];
        int index = 0;
        for (int i = 0; i < shirts.length; i++) {
            if (shirts[i].size == size) {
                shirtsBySize[index] = shirts[i];
                index++;
            }
        }
        return shirtsBySize;
    }

    public void addShirt(Shirt newShirt) {
        this.shirts = Utils.addToArray(shirts, newShirt);
    }

}
