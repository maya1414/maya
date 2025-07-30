public class Patrick extends Fish {


    public Patrick(String name, String favoriteFood, int age) {
        super(name, favoriteFood, age);
    }

    @Override
    public void goToWork() {
        takeTheTrain();
    }
}
