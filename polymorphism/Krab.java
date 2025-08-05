package polymorphism;

public class Krab extends Fish {

    public Krab(String name, String favoriteFood, int age) {
        super(name, favoriteFood, age);
    }

    @Override
    public void goToWork() {
        takeTheCar();
    }
}
