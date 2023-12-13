public class RewardValue {

    private final double cash;
    private final static double CONVERT_RATE = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.cash = miles * CONVERT_RATE;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return (int) (cash / CONVERT_RATE);
    }
}
