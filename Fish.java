public abstract class Fish {

    int age;

    String name;

    String favoriteFood;

    public Fish(String name, String favoriteFood, int age) {
        this.age = age;
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String getName() {
        return name;
    }

    public void takeTheCar() {
        System.out.println("takeTheCar");
    }

    public void takeTheTrain() {
        System.out.println("takeTheTrain");
    }

    public void walkByFoot() {
        System.out.println("walkByFoot");
    }

}
