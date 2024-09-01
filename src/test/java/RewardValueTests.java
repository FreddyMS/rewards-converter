import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 5000;
        double milesValue = cashValue * .0035;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(17.5, rewardValue.getMilesValue());

        //assert false;
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 17.5;
        double cashValue = (milesValue) * (1/(.0035));
        var rewardValue = new RewardValue(cashValue);
        assertEquals(5000.0, rewardValue.getCashValue());
    }
}
