package polymorphism;

public class SpongeBobChef extends SpongeBob {

    public SpongeBobChef(String name, String favoriteFood, int age) {
        super(name, favoriteFood, age);
        super.playBasketBall();
    }

    @Override
    public void playBasketBall() {
        System.out.println("playing basketball");
    }

}
