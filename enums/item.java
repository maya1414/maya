package enums;

import java.util.Scanner;

public enum item {
    CHEESE("cheese", 5),
    WATER("water", 3),
    OIL("oil", 10),
    SUGAR("sugar", 7),
    APPLES("apples", Constants.PRICE_BY_WEIGHT);


    public final String name;
    public final int price;

    item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int totalPrice(item[] items, int[] quantity){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].getPrice() == Constants.PRICE_BY_WEIGHT){
                System.out.println("Enetr the price of apples: ");
                int priceOfApple = reader.nextInt();
                sum+= priceOfApple * quantity[i];
            }else {
                sum+= items[i].getPrice() * quantity[i];
            }
        }
        return sum;
    }
}
