package hw14;

public class Price {
    private int amount;
    private String currencySymbol;

    public Price(int amount, String currencySymbol) {
        this.amount = amount;
        this.currencySymbol = currencySymbol;
    }

    public int getAmount() {
        return amount;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }
}
