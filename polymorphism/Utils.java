package polymorphism;

public class Utils {

    public static void isbasketBallPlayerFish(ProfessionalBasketBallPlayer[] players) {
        for (ProfessionalBasketBallPlayer player : players) {
            if (player instanceof Fish fish) {
                fish.goToWork();
            }
            player.playBasketBall();
        }
    }

    public static void makeArrayOfFishWhoBasketballPlayer(Fish[] fishArr){
        int count = 0;
        for (Fish fish : fishArr) {
            if (fish instanceof ProfessionalBasketBallPlayer){
                count++;
            }
        }
        ProfessionalBasketBallPlayer[] professionalBasketBallPlayerFish =new ProfessionalBasketBallPlayer[count];
        int index = 0;
        for (Fish fish : fishArr) {
            if (fish instanceof ProfessionalBasketBallPlayer player){
                professionalBasketBallPlayerFish[index] = player;
                index++;
            }
        }
        isbasketBallPlayerFish(professionalBasketBallPlayerFish);
    }

}
