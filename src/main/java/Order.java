public class Order {
    private boolean isDead;
    private boolean isSeparated;
    private boolean isRetired;

    double price() {
        return new PriceCalculator(this).compute();
    }

    double getPayAmount() {
        if (isDead) { return deadAmount(); }
        if (isSeparated) { return separatedAmount(); }
        if (isRetired) { return retiredAmount(); }
        return normalPayAmount();
    }

    private double normalPayAmount() {
        return 0;
    }

    private double retiredAmount() {
        return 0;
    }

    private double separatedAmount() {
        return 0;
    }

    private double deadAmount() {
        return 0;
    }
}
