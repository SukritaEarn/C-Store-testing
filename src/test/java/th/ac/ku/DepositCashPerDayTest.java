package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashPerDayTest {

    private final float alreadyDepositedCashToday = 15000.00f;

    @Test
    void total_deposit_amount_less_than_50000_in_one_day_result_should_be_True() {
        boolean expectedResult = true;
        float depositCash = 1500.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerDay(depositCash+alreadyDepositedCashToday);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void total_deposit_amount_equal_to_50000_in_one_day_result_should_be_True() {
        boolean expectedResult = true;
        float depositCash = 35000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerDay(depositCash+alreadyDepositedCashToday);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void total_deposit_amount_greater_than_50000_in_one_day_result_should_be_False() {
        boolean expectedResult = false;
        float depositCash = 50000.50f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerDay(depositCash+alreadyDepositedCashToday);

        assertEquals(expectedResult, actualResult);
    }

}