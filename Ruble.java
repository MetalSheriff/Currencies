package Currencies;

public class Ruble extends Money {
    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 1.00;
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
