package productsalesaplication;

public class MattressCalculations {

    public static double calculateVAT(double price) {
        return price * 0.15;
    }

    public static double calculateCommission(double price) {
        return price * 0.05;
    }

    public static double calculateTotal(double price) {
        return price + calculateVAT(price)
                + calculateCommission(price);
    }
}
