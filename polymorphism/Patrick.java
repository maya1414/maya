package polymorphism;

public class Patrick extends Fish implements ProfessionalBasketBallPlayer {


    public Patrick(String name, String favoriteFood, int age) {
        super(name, favoriteFood, age);
    }

    @Override
    public void goToWork() {
        takeTheTrain();
    }

    @Override
    public void playBasketBall() {
        System.out.println("playBasketBall");
    }
}
