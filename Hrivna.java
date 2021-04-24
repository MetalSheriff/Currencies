package Currencies;

public class Hrivna extends Money {
    public Hrivna(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 2.63;
    }

    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}
