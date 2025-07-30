public class SpongeBob extends Fish implements ProfessionalBasketBallPlayer{


    public SpongeBob(String name, String favoriteFood, int age) {
        super(name, favoriteFood, age);
    }

    @Override
    public void goToWork() {
        walkByFoot();
    }

    @Override
    public void playBasketBall() {
        System.out.println("playBasketBalll");
    }
}
