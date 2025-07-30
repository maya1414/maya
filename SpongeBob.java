public class SpongeBob extends Fish{


    public SpongeBob(String name, String favoriteFood, int age) {
        super(name, favoriteFood, age);
    }

    @Override
    public void goToWork() {
        walkByFoot();
    }
}
