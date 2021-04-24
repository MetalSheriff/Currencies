package Currencies;

public class USD extends Money {
    public USD(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 70.80;
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
