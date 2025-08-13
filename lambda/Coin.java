package lambda;

public enum Coin {
    ST(x -> x + 1),
    EURO(x -> x * 1.15),
    SHEKEL(x -> x * 0.3),
    DOLLAR(x ->x);

    private Converter converter;

    Coin(Converter converter) {
        this.converter = converter;
    }

    public double toDollar(double amount) {
        return converter.convert(amount);
    }

}
