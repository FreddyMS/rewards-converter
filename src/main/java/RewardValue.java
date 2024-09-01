public class RewardValue {

    private double cashValue;
    private double milesValue;

    public RewardValue(double cash) {
        this.cashValue = cash;
        this.milesValue = cash *0.0035; // Convert cash to miles
    }

    // Constructor for miles value
    public RewardValue(float miles) {
        this.milesValue = miles;
        this.cashValue = miles / 0.0035; // Convert miles to cash
    }

    public  double getCashValue()
    {
        return cashValue;
    }
    public double getMilesValue()
    {
        return milesValue;
    }

}
